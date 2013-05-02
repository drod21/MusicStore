package testapp

class AlbumController {
	static scaffold = true

  AlbumController() {
  }

  def index() {
  }

  def save() {
      if (session.user.isAdmin()) {
      def album = new Album(params["album"])
          def artist = new Artist(params["name"])
      album.properties = params
          artist.properties = params
      if (album.save()) {
        redirect action: "show", id:album.id
      } else {
        render view: "edit", model: [album:album]
      }
      }
  }
    def display() {
        def album = Album.get(params.id)
        if(album) {
            def artist = album.artist
            render(template:"album", model:[artist:artist, album:album])
        }
        else {
            render "Album not found."
        }
    }

def list()  {
    params.max = Math.min(params.max ? params.int('max') : 10, 100)
    [albumInstanceList: Album.list(params), albumInstanceTotal: Album.count()]
}

def show() {
    def albumInstance = Album.get(params.id)
    if (!albumInstance) {
        flash.message = message(code: 'default.not.found.message',args: [message(code:'album.label',
         default: 'Album'), params.id])
         redirect(action: "list")
         return
    }
    [albumInstance: albumInstance]
  }
}
