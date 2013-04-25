package testapp

class Inventory {
	static belongsTo = [adminName:Admin]
	static hasMany = [albums:Album]

	
	Inventory(){
		albums = [""]
	}

	def addAlbum(Album album) {
        addAlbum = new Album(params.id)
    }

	def deleteAlbum(Album album) {
        Album.get(params.id)
        Album.delete(flush: true)
    }

    static constraints = {
    }
}
