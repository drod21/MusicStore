package testapp

class Inventory {
	static belongsTo = [adminName:Admin]
	static hasMany = [albums:Album]

	
	Inventory(){
		albums = [""]
	}

	def addAlbum() {
        def addAlbum
        Inventory.addAlbum = new Album(params.id)
    }

	def deleteAlbum(Album album) {
        Album.get(params.id)
        Album.delete(flush: true)
    }

    static constraints = {
    }
}
