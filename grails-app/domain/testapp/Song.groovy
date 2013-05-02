package testapp

class Song {

    Date dateCreated
    Date lastUpdated

    String title
    String genre
    Integer duration
    Integer year
    Float price
    Integer trackNumber
    Album album
    Artist artist
    String fileLocation

    static constraints = {
	title(blank:false)
	duration(min:1)
	year range:1900..2100
        fileLocation(blank:false)
        price range: 0.99..5.99
    }

    String toString() { title }
}
