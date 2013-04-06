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
		password:'letmein',
		email:'drod2169@gmail.com',
		firstName:'Derek',
		lastName:'Rodriguez')
	assert user.getFirstName().equals('Derek'), getLastName().equals('Rodriguez')
    }
}
