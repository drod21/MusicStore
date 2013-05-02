package testapp

class AlbumController {
    static scaffold = true

    AlbumController() {
	}

    def index() {
	
    }

    def save(AlbumCreateCommand cmd) {
        if(cmd.validate()) {
            def album = cmd.createAlbum()
            album.save()
            redirect(action: "show", id:album.id)
        } else {
            render view: "create", model:[cmd:cmd]
        }
    }
    def display = {
        def album = Album.get(params.id)
        if(album) {
            //def artist = album.artist
            //render(template:"album", model:[artist:artist, album:album])
        }
        else {
            render "Album not found."
        }
    }

def list() {
    params.max = Math.min(params.max ? params.int('max') : 10, 100)
    [albumInstanceList: Album.list(params), albumInstanceTotal: Album.count()]
}

def addToCart(Long id) { 
	def shoppingCart = ShoppingCart.findByUser(session.user); def album = Album.get(id); shoppingCart.addToAlbums(album);
}

def removeFromCart(Long id) {
	def shoppingCart = ShoppingCart.findByUser(session.user); def album = Album.get(id); shoppingCart.removeFromAlbums(album);
}

def show() {
    albumInstance = Album.get(params.id)
    if (!albumInstance) {
        flash.message = message(code: 'default.not.found.message',args: [message(code:'album.label',
         default: 'Album'), params.id])
         redirect(action: "list")
         return
    }
    
    [albumInstance: albumInstance]
}
}

    class AlbumCreateCommand {
        //String artist
        String title
        List songs = []
        List durations = []

        static constraints = {
            //artist blank: false
            title blank: false
            songs minSize: 1
        }

        Album createAlbum() {
            //def artist = Artist.findByName(artist) ?: new Artist(name:artist)
            def album = new Album(title:title)
            songs.eachWithIndex { songTitle, i ->
			album.addToSongs(title:songTitle, duration:durations[i])
            }
            return album
        }
}

