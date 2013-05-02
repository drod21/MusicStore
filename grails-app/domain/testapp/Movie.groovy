package testapp

class Movie {
    
    String title
    String leadAct
    String genre
    int rentalDuration

    static constraints = {
        title blank:false
        leadAct blank:false
        genre blank:false
        rentalDuration min:1
    }
}
