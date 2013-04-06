package testapp

class Inventory {
	static belongsTo = [admin:User]
	static hasMany = [albums:Album]
	Inventory(){
		albums = [""]
	}

	def addAlbum(Album album) {

	}

	def deleteAlbum(Album album) {
	album.delete()
	}

    static constraints = {
    }
}
