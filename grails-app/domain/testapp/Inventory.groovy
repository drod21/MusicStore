package testapp

class Inventory {
	static belongsTo = [adminName:Admin]
	static hasMany = [albums:Album]

	
	Inventory(){
		albums = [""]
	}

	def addAlbum() {
        def addAlbum
        addAlbum = new Album(params.id)
    }

	def deleteAlbum(Album album) {
        Album.get(params.id)
        def var = cart.removeFromAlbums(album)
    }

    static constraints = {
    }
}
