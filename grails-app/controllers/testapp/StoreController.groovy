package testapp

class StoreController {

    def index() { }

	def list() {
		def albumList = Album.list() 
		[albums:albumList.sort()]
    }
	
	def shop() {
	}
}
