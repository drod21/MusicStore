package testapp

class Inventory {
	static belongsTo = [adminName:Admin]
	static hasMany = [albums:Album]

	
	Inventory(){
		albums = [""]
	}

	def addAlbum(Album album) {
	}

	def deleteAlbum(Album album) {
	}

    static constraints = {
    }
}
