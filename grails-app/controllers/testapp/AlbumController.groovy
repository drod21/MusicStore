package testapp

class AlbumController {
	def save(params){
	    if(Album.save()) {
		album.properties = params
		album.save()
		redirect(action: "show", id:album.id)
		} else {
		render(view: "create", model:[cmd:cmd])
	}
    }
}


