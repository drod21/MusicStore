package testapp

class Album {
	String title
	String genre
	Integer year
	Date dateCreated
	Date lastUpdated


    List songs
	static hasMany = [songs:Song]
	static belongsTo = [artist:Artist]

    static constraints = {
	title(blank:false)
	year range:1900..2100
    }
    String toString() { title }
}
