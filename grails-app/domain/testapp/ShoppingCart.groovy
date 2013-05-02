package testapp

class ShoppingCart {
	
	static hasMany = [albums:Album]
	float total

	User user

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
