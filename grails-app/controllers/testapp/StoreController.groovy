package testapp

class StoreController {

    def index() { }

	def list() {
		def albumList = Album.list() 
		[albums:albumList.sort()]
    }
	
	def shop = {
		def c = Album.createCriteria()
		def genreList = c.get {
			projections {
				distinct('genre')
			}
		}
		[genres:genreList.sort(),
			top5Albums:Album.list(max:5, sort:"dateCreated", order:"desc"),
			top5Songs:Song.list(max:5, sort:"dateCreated", order:"desc"),
			top5Artists:Artist.list(max:5, sort:"dateCreated", order:"desc")] 
	}
}
