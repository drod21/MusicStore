package testapp

class ShoppingCart {
	static belongsTo = [user:User]
	static hasMany = [albums:Album]

	ShoppingCart(){
		albums = [""]
	}

	def addAlbum(Album album) {
	new Album()
	}

	def removeFromCart(Album album) {
	Album.findByTitle("")
	cart.albums.find { it.title = ' ' }
	cart.removeFromAlbums(album)
	}



    static constraints = {
    }
}
