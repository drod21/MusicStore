package testapp

class Inventory {
	static hasMany = [albums:Album]
	Inventory(){
		albums = [""]
	}

	def addAlbum(Album album) {
	
	}

    static constraints = {
    }
}
