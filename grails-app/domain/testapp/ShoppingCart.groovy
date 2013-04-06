package testapp

class ShoppingCart {
	static hasMany = [albums:Album]

	ShoppingCart(){
		albums = [""]
	}

	def addAlbum(Album album) {
	
	}

	def deleteAlbum(Album album) {
	
	}

    static constraints = {
    }
}
