package testapp

class User {
	String login
	String password
	String confirm
	String firstName
	String lastName
	boolean admin;

	static hasMany = [purchasedSongs:Song, movieRentals:Movie]
    static hasOne = [cart:ShoppingCart]

	def User = {
	  admin = false	
	}

    static constraints = {
	login(blank:false, unique:true, size:5..15)
    cart(nullable: true)
	password(blank:false, matches:/[\w\d]+/, size:5..15)
	firstName(blank:false)
	lastName(blank:false)
    }
    
    User () {
        purchasedSongs = []
        movieRentals = []
    }

	def isAdmin = {
	  return admin
	}

	def makeAdmin = {	
	   admin = true
	   merge()
	}

}
