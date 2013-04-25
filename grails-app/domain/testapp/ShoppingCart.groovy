package testapp

class ShoppingCart {
	static belongsTo = [user:User]
	static hasMany = [albums:Album]

	ShoppingCart(){
		albums = [""]
	}

    def addAlbum(Album album) {
	album = getAlbum(params.id)
	album.addAlbum(album)
    }

    def deleteAlbum(Album album) {
        Album.get(params.id)
        cart.removeFromAlbums(album)
	}


    static constraints = {
    }
}
