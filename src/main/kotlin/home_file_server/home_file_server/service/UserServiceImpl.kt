package home_file_server.home_file_server.service

import home_file_server.home_file_server.entity.Role
import home_file_server.home_file_server.entity.User
import home_file_server.home_file_server.repository.RoleRepository
import home_file_server.home_file_server.repository.UserRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service
import java.util.*


@Service
class UserServiceImpl(
    private val userRepository: UserRepository,
    private val bCryptPasswordEncoder: BCryptPasswordEncoder,
) : UserService {
    override fun addUser(user: User): Boolean {
        val addedUser: User = setPasswordAndDefaultRoleAndGet(user)
        userRepository.save(user)
        return true
    }

    private fun setPasswordAndDefaultRoleAndGet(user: User): User {
        val defaultRole: String = "ROLE_USER"
        user.roles = Collections.singleton(Role(1, defaultRole))
        user.password = bCryptPasswordEncoder.encode(user.password)
        return user
    }

    override fun loadUserByUsername(username: String?): UserDetails {
        val user: User = userRepository.findByLogin(username)
        if (user == null) {
            throw UsernameNotFoundException("User not found")
        }
        return user
    }
}