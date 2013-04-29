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
            album.delete()
                       .removeFromInventory album
    }

    def updateAlbum() {
        def album = Album.get(id)
        album = ""
        album.save()
    }

    def list() {
        def albums = Album.id()
        albums.each {
        println it['title']
        }
        render view: "list", model:[title:Album]
    }
}
