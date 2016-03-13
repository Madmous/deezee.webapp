import com.madmous.deezee.Role
import com.madmous.deezee.User
import com.madmous.deezee.UserRole

class BootStrap {

    def init = { servletContext ->

        def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
        def userRole = new Role(authority: 'ROLE_USER').save(flush: true)

        def user = User.findByUsername("mous")
        if (user == null){
            def testUser = new User(username: 'mous', password: 'mous')
            testUser.save(flush: true)
            UserRole.create testUser, adminRole, true
        }

        def user2 = User.findByUsername("test")
        if (user2 == null){
            def testUser = new User(username: 'test', password: 'test')
            testUser.save(flush: true)
            UserRole.create testUser, adminRole, true
        }

    }
    def destroy = {
    }
}
