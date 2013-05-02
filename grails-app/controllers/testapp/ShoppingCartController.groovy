package testapp
import testapp.Album
import testapp.AlbumController

class ShoppingCartController {
	static scaffold = true
	
	ShoppingCartController() {
	}


    def index() { }

    def addToCart() {
        Album album = Album.findById(params.album)
        if ( !session.user.cart ) {
            session.user.cart = new ShoppingCart();
        }
        session.user.cart.addToCart(album);
        session.user.cart.save()
        redirect(action:'list')
    }

    def removeFromCart() {
        Album album = Album.findById(params.album)
        println("Select an album to remove:")
        session.user.cart.removeFromCart(album)
        session.user.cart.save()
        }

    def list() {
            if ( !session.user.cart ) {
                session.user.cart = new ShoppingCart();
            }
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [shoppingCartInstanceList: session.user.cart.list(params.id), shoppingCartInstanceTotal: ShoppingCart.count()]
    }


        def show() {
            def shoppingCartInstance = session.user.cart
            if (!shoppingCartInstance) {
                flash.message = message(code: 'default.not.found.message',args: [message(code:'session.user.cart.label',
                        default: 'ShoppingCart'), params.id])
                redirect(action: "list")
                return
            }
        [shoppingCartInstance: shoppingCartInstance]
    }

}
