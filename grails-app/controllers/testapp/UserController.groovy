package testapp

class UserController {
    def login = { LoginCommand cmd ->
        if(request.method == 'POST') {
            if(!cmd.hasErrors()) {
                session.user = cmd.getUser()
                redirect(controller:'store')
            }
            else {
                render(view:'/store/index', model:[loginCmd:cmd])
            }
        }
        else {
            render(view:'/store/index')
        }
    }

    def register = {
        if(request.method == 'POST') {
            def u = new User(params)
            //The following lines mock purchased songs so I could test the playback feature in the absence of any inventory but it causes a hibernate error that has stumped me for over 5 hours. 
            //If you can get these Songs into the purchasedSong list then you shoudl have a working player. It did work earlier, but now it doesn't. Go figure.
            //u.addToPurchasedSongs(title: "Cry For You", genre: "Pop", artist: "September", duration: 30, year: 2007, fileLocation:"http://www.rjsnell.com/musicstore/CryForYou.mp3")
            //u.addToPurchasedSongs(title: "Right In The Night", genre: "Trance", artist: "Jam and Spoon", duration:30, year:2000, fileLocation:"http://www.rjsnell.com/musicstore/RightInTheNight.mp3")
            //u.addToPurchasedSongs(title: "Heron Blue", genre: "Alternative", artist: "Sun Kil Moon", duration:30, year:2009, fileLocation:"http://www.rjsnell.com/musicstore/HeronBlue.mp3")
            //u.addToPurchasedSongs(title: "Fur Elise", genre: "Classical", artist: "Beethoven", duration:30, year:1901, fileLocation:"http://www.rjsnell.com/musicstore/FurElise.mp3")
            //u.addToPurchasedSongs(title: "There She Goes", genre: "Pop", artist: "The La's", duration:30, year:2000, fileLocation:"http://www.rjsnell.com/musicstore/ThereSheGoes.mp3")       
            if(u.password != params.confirm) {
                u.errors.rejectValue("password", "user.password.dontmatch")
                return [user:u]
            }
            else if(u.save()) {
                session.user = u
		u.save()
                redirect(controller:"store")
            }
            else {
                return [user:u]
            }
        }
    }

    def makeAdmin() {
	session.user.makeAdmin()
	render view: "/store/index"
	}

    def makeAdmin() {
	session.user.makeAdmin()
	render view: "/store/index"
	}

    def logout = {
        session.invalidate()
        redirect(controller:"store")
    }
	
    def music = {
    }
}
class LoginCommand {
    String login
    String password
    private u
    User getUser() {
        if(!u && login)
        u = User.findByLogin(login, [fetch:[purchasedSongs:'join']])
        return u
    }
    static constraints = {
        login blank:false, validator:{ val, obj ->
            if(!obj.user)
            return "user.not.found"
        }
        password blank:false, validator:{ val, obj ->
            if(obj.user && obj.user.password != val)
            return "user.password.invalid"
        }
    }
}
