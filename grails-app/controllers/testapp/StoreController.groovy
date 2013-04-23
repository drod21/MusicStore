package testapp

class StoreController {

    def index() { }

    def albumList = Albums.list() {
    [albums:albumList.sort()]
    }
}
