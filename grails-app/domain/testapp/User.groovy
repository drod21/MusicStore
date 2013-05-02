package testapp

class User {
	String login
	String password
	String firstName
	String lastName

	static hasMany = [purchasedSongs:Song, movieRentals:Movie]


    static constraints = {
	login(blank:false, unique:true, size:5..15)
	password(blank:false, matches:/[\w\d]+/, size:5..15)
	firstName(blank:false)
	lastName(blank:false)
    }
    
    User () {
        purchasedSongs = []
        movieRentals = []
    }


}
