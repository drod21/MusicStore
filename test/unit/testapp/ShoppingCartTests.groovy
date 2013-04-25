package testapp



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(ShoppingCart)
class ShoppingCartTests {
    void testAddToCart() {
    @Mock([ShoppingCart, Album])
	def cart = new ShoppingCart()
	def album = new Album(title:'All Eyes On Me')
	cart.addAlbum(album)
	Integer count = cart.albums.size()
	assert count == 1
    }

    void testRemoveFromCart() {
    @Mock([ShoppingCart, Album])
	def cart = new ShoppingCart()
	def album = new Album(title:'All Eyes On Me')
	cart.addAlbum(album)
	Album.findByTitle("All Eyes On Me")
	cart.removeFromAlbums(album)
	Integer count = cart.albums.size()
	assert count == 0
	}
}
