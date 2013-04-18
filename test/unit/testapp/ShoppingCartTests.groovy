package testapp



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(ShoppingCart)
class ShoppingCartTests {

    void testAddToCart() {
	def cart = new ShoppingCart()
	cart.addAlbum(new Album(title:'All Eyes On Me'))
	Integer count = cart.albums.size()
	assert count == 1
    }

    void testRemoveFromCart() {
	def cart = new ShoppingCart()
	cart.addAlbum(new Album(title:'All Eyes On Me'))
	Album.findByTitle("All Eyes On Me")
	cart.removeFromAlbums(album)
	}
}
