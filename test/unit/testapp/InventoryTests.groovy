package testapp



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Inventory)
class InventoryTests {

    void testAddAlbumToInventory() {
	Inventory inventory = new Inventory()
	inventory.addAlbum(new Album(title:'Me Against The World'))
	Integer count = inventory.albums.size()
	assert count == 1       
    }

    void testRemoveAlbumFromInventory() {
	def inventory = new Inventory()
	inventory.delete()
	Integer count = inventory.albums.size()
	assert count == 1
	}
}
