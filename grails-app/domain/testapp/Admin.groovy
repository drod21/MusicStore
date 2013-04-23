package testapp

class Admin extends User {
	static hasOne = [inventory:Inventory]

	String adminName

    static constraints = {
	adminName(blank:false)
    }
}
