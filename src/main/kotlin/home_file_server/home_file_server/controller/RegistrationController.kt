package home_file_server.home_file_server.controller

import home_file_server.home_file_server.entity.User
import home_file_server.home_file_server.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/registration")
class RegistrationController(private val userService: UserService) {

    @GetMapping
    fun registrationPage(): String {
        return "registrPage"
    }

    @PostMapping
    fun addUser(@RequestBody user: User): ResponseEntity<User> {
        val isAdd: Boolean = userService.addUser(user)
        return if (isAdd) ResponseEntity(user, HttpStatus.OK) else ResponseEntity(null, HttpStatus.NOT_FOUND)
    }
}