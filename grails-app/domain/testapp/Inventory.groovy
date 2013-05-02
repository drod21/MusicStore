package testapp

class Inventory {
    static belongsTo = [adminName:Admin]
    static hasMany = [albums:Album, movies:Movie]
        
    static constraints = {
    }

	
    Inventory(){
        albums = []
        movies = []
    }
	
    def getInventoryCount() {
	return albums
    }


    def addAlbumToInventory(Album album) {
        albums.add(album)
    }
    
    def removeAlbumFromInventory(Album album) {
        albums -= album
    }
        
    def addMovieToInventory(Movie movie) {
        movies.add(movie)
    }
    
    def removeMovieFromInventory(Movie movie) {
        movies -= movie
    }
        
    
}    
