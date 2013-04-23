package testapp

class AlbumController {

    def save(AlbumCreateCommand cmd) {
        if(cmd.validate()) {
            def album = cmd.createAlbum()
            album.save()
            redirect(action: "show", id:album, id)
        } else {
            render view: "create", model:[cmd:cmd]
        }
    }
    def display = {
        def album = Album.get(params.id)
        if(album) {
            def artist = album.artist
            render(template:"album", model:[artist:artist, album:album])
        }
        else {
            render "Album not found."
        }
    }
}
    class AlbumCreateCommand {
        String artist
        String title
        List songs = []
        List durations = []

        static constraints = {
            artist blank: false
            title blank: false
            songs minSize: 1
        }

        Album createAlbum() {
            def artist = Artist.findByName(artist) ?: new Artist(name:artist)
            def album = new Album(title:title)
            songs.eachWithIndex { songTitle, i ->
            album.addToSongs(title:songTitle, duration:durations[i])
            }
            return album
        }
}

