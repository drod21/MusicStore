package testapp

class Album {
	String title

	static hasMany = [songs:Song]

    static constraints = {
	title(blank:false)
    }
}
