package testapp

class Album {
	String title
    String genre


    List songs
	static hasMany = [songs:Song]
	static belongsTo = [artist:Artist]

    static constraints = {
	title(blank:false)
    }
    String toString() { title }
}
