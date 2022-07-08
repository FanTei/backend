package home_file_server.home_file_server.service

import home_file_server.home_file_server.entity.User
import org.springframework.security.core.userdetails.UserDetailsService

interface UserService : UserDetailsService {
    fun addUser(user: User): Boolean
}