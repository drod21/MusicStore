package testapp

class Admin extends User {
	static hasOne = [inventory:Inventory]

	String adminName

	def inventory = new Inventory() {
	}

	def addAlbum(Album album) {
		new Album(id)
	}
	def deleteAlbum(Album album) {
		Album.get(album.id)
		album.delete(flush: true)
	}

    static constraints = {
	adminName(blank:false)
    }
}
