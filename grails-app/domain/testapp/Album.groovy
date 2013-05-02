package testapp

class Album {
	String title
	String genre
	Integer year
    Float price
	Date dateCreated
	Date lastUpdated


    List songs
	static hasMany = [songs:Song]
	static belongsTo = [artist:Artist]

    static constraints = {
	title(blank:false)
	year range: 1900..2100
    price range: 9.99..19.99
    }
    String toString() { title }
}
