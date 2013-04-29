package testapp

class Song {

    Date dateCreated
    Date lastUpdated

    String title
    String genre
    Integer duration
    Integer year
    Integer trackNumber
    Album album
    Artist artist

    static constraints = {
	title(blank:false)
	duration(min:1)
	year range:1900..2100
	}

    String toString() { title }
}
