package testapp

class StoreController {

    def index() {
       }
    
    def playSong() {
        [ params: params ]
    }

	def list() {
		def albumList = Album.list() 
		[albums:albumList.sort()]
    }
	
	def shop = {
        def genreList = Album.withCriteria {
			projections {
				distinct "genre"
			}
		}
		[genres:genreList.sort(),
			top5Albums:Album.list(max:5, sort:"dateCreated", order:"desc"),
			top5Songs:Song.list(max:5, sort:"dateCreated", order:"desc"),
			top5Artists:Artist.list(max:5, sort:"dateCreated", order:"desc")] 
	}
}
