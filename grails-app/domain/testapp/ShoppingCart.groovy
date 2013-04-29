package testapp

class ShoppingCart {
	static belongsTo = [user:User]
	static hasMany = [albums:Album]

	ShoppingCart(){
		albums = [""]
	}

	def getShoppingCartCount() {
	return albums
    }

    def addToCart(Album album) {
    }

    def removeFromCart(Album album) {
	}


    static constraints = {
    }
}
