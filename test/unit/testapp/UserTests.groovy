package testapp



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserTests {

    void testUserRegister() {
       	def user = new User(login:'drod2169',
		email:'drod2169@gmail.com',
		firstName:'Derek',
		lastName:'Rodriguez')
	assert user.getFirstName().equals('Derek'), getLastName().equals('Rodriguez')
    }

	void testAddToCart() {
	ShoppingCart cart = new ShoppingCart()
	cart.addAlbum(new Album(title:'All Eyez On Me'))
	Integer count = cart.albums.size()
	assert count == 1
	}

	void testRemoveFromCart() {
	ShoppingCart cart = new ShoppingCart()
	cart.removeFromAlbums(album)
	Integer count = cart.size()
	assert count == 0
	}
}
