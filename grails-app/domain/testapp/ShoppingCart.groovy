package testapp
import testapp.Album

class ShoppingCart {

	static hasMany = [albums:Album]
	float total

	User user

	ShoppingCart() {
		albums = [ ]
	}

	def getShoppingCartCount() {
	return albums
    }

    def addToCart(Album album) {
        albums.add(album)

    }

    def removeFromCart(Album album) {
	}


    static constraints = {
    }
}
