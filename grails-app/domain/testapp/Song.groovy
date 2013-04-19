package testapp

class Song {

    String title
    String genre
    Integer duration
    Album album
    Artist artist

    static constraints = {
	title(blank:false)
	duration(min:1)
	}

    String toString() { title }
}
