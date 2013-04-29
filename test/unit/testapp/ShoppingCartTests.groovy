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
	def album = new Album(title:"All Eyes On Me")
	cart.addToCart(album)
	Integer count = cart.albums.size()
	assert count == 1
    }

    void testRemoveFromCart() {
    @Mock([ShoppingCart, Album])
	def cart = new ShoppingCart()
	def tupac = new Album(title: 'Me Against The World')
	cart.addToCart(tupac)
	def count = cart.getShoppingCartCount()
	cart.removeFromCart(tupac)
	def afterCount = cart.getShoppingCartCount()
	assertEquals(afterCount,count - 1)
	}
}
