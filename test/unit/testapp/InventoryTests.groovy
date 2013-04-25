package testapp



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Inventory)
class InventoryTests {

    void testAddAlbumToInventory() {
	@Mock([Inventory, Album])
	def inventory = new Inventory()
	inventory.addAlbum(new Album(title:'Me Against The World'))
	Integer count = inventory.albums.size()
	assert count == 1       
    }

    void testRemoveAlbumFromInventory() {
	@Mock([Inventory, Album])
        def inventory = new Inventory()
        inventory.addAlbum(new Album(title:'Me Against The World'))
        def album = Album.getId(1)
        album.delete(flush: true)
        Integer count = inventory.albums.size()
        assert count == 0
	}
}
