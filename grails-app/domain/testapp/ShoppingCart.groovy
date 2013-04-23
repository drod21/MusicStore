package testapp

class ShoppingCart {
	static belongsTo = [user:User]
	static hasMany = [albums:Album]

	ShoppingCart(){
		albums = [""]
	}

    def addAlbum() {
        def addAlbum
        addAlbum = new Album(params.id)
    }

    def deleteAlbum(Album album) {
        Album.get(params.id)
        def cart
        cart = cart.removeFromAlbums(album)


    static constraints = {
    }
}
