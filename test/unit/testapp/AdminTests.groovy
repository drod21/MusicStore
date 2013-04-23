package testapp



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Admin)
class AdminTests {

    void testUserAdmin() {
	def adminName = new User(login:'AdminTest',
			email:'admin@musicstore.com')
	assert adminName.getLogin().equals('AdminTest'), getEmail().equals('admin@musicstore.com')
}

}
