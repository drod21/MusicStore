package testapp

class ShoppingCartController {
	static scaffold = true
	
	ShoppingCartController() {
	}


    def index() {
        redirect(action: "list")
    }

    def addToCart() {
        def album = Album.get(params.id)
        if (album == null) {
            flash.error = "Could not add album to cart! Could find product with id [${params.id}]."
        }
        album.addToCart(album)
        album.save(flush: true)
        redirect(action:'cart')
    }

    def removeFromCart() {
        def cartItems =  {
            if (ShoppingCart == null) {
                flash.error = "You have no albums in your cart."
            } else {
                def cart = ShoppingCart.getAll()
                def album = cart.list()
                cart.each {
                    println it.getAt('album.title')
                }
                println("Select an album to remove:")
                cart.removeFromCart(album)
            }

        }
    }

    def list() {
        def cartItems =  {
            if (ShoppingCart == null) {
                flash.error = "You have no albums in your cart."
            } else {
                def cart = ShoppingCart.getAll()
                def album = cart.list()
                cart.each {
                    println it.getAt('album.title')
                }
                render view: "list", model:[title:Album]
            }

        }
    }
}

