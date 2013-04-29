package testapp

class Inventory {
	static belongsTo = [adminName:Admin]
	static hasMany = [albums:Album]

	
	Inventory(){
		albums = [""]
	}
	
	def getInventoryCount() {
	return albums
    }

	def addAlbumToInventory(Album album) {
    }

	def removeAlbumFromInventory(Album album) {
    }

    static constraints = {
    }
}
