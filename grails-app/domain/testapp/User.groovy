package testapp

class User {
	String login
	String password
	String firstName
	String lastName
	boolean admin;

	static hasOne = [ cart: ShoppingCart ]
	static hasMany = [purchasedSongs:Song]

	def User = {
	  admin = false	
	}

    static constraints = {
	login(blank:false, unique:true, size:5..15)
	password(blank:false, matches:/[\w\d]+/, size:5..15)
	firstName(blank:false)
	lastName(blank:false)
    }

	def isAdmin = {
	  return admin
	}

	def makeAdmin = {	
	   admin = true
	   merge()

}
