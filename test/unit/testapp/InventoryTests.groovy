package testapp



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Inventory)
class InventoryTests {

    void testAddAlbum() {
	@Mock([Inventory, Album])
	def inventory = new Inventory()
	def tupac = new Album(title: 'Me Against The World')
	inventory.addAlbumToInventory(tupac)
	Integer count = inventory.albums.size()
	assert count == 1       
    }

    void testDeleteAlbum() {
	@Mock([Inventory, Album])
        def inventory = new Inventory()
	def tupac = new Album(title: 'Me Against The World')
        inventory.addAlbumToInventory(tupac)
	def count = inventory.getInventoryCount()
        inventory.removeAlbumFromInventory(tupac)
        def afterCount = inventory.getInventoryCount()
        assertEquals(afterCount,count - 1)
	}
}
