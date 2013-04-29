package testapp

import testapp.AlbumController

class InventoryController {

    def index() {
        redirect(action: "list")
    }

    def addToInventory() {
        if(cmd.validate()) {
            def album = cmd.createAlbum()
            album.save()
            redirect(action: "show", id:album, id)
        } else {
            render view: "create", model:[cmd:cmd]
        }
    }

    private static def removeFromInventory(Album album) {
            album.removeFromInventory
    }

    def updateAlbum() {
        def album = Album.get(id)
        album = ""
        album.save()
    }

    def list() {
        def getInventoryCount = {
            return albums
        }
        render view: "list", model:[title:Album]
    }
}
