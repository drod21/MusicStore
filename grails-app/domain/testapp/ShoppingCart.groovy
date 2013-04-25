package testapp

class ShoppingCart {
	static belongsTo = [user:User]
	static hasMany = [albums:Album]

	ShoppingCart(){
		albums = [""]
	}

    def addAlbum(Album album) {
        cart.addToAlbums(new Album(params.id))
    }

    def deleteAlbum(Album album) {
        Album.get(params.id)
        cart.removeFromAlbums(album)
	}


    static constraints = {
    }
}
