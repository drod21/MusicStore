package testapp

class Artist {
    String name
    Date dateCreated
    Date lastUpdated

    static hasMany = [albums:Album]

    static constraints = {
	name(blank: false)
    }
    String toString() { name }
	
	
}
