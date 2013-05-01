package testapp

class ArtistController {
	static scaffold = true

	ArtistController() { 
	}

        def show() {
            def artist = Artist.findByName(params.artistName)
}

}
