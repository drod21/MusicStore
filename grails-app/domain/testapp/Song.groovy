package testapp

class Song {

    Date dateCreated
    Date lastUpdated

    String title
    String genre
    BigDecimal duration
    Integer year
    Float price
    Integer trackNumber
    Album album
    Artist artist

    static constraints = {
	title(blank:false)
	duration(min:1.00)
	year range:1900..2100
    price range: 0.99..5.99
	}

    String toString() { title }
}
