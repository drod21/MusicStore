package testapp

class ShoppingCartController {

    def addToCart = {

    def album = Album.get(params.id)

    if (album == null) {
        flash.error = "Could not add album to cart! Could find product with id [${params.id}]."
    }

    AlbumInstance.addToAlbums(album)

    AlbumInstance.save(flush:true)


    redirect(action:'cart')
}

    def removeFromCart() {
        def cartItems =  {
            if (ShoppingCart == null) {
                flash.error = "You have no albums in your cart."
            } else {
                println("Select an album to remove:")
                cart.getProperties(params.id)
                cart.removeFromCart(album)
            }

        }


    }

}