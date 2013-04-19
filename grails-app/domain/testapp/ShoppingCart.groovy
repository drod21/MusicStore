package testapp

class ShoppingCart {
	static belongsTo = [user:User]
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
