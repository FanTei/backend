package home_file_server.home_file_server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HomeFileServerBackendApplication

fun main(args: Array<String>) {
	runApplication<HomeFileServerBackendApplication>(*args)
}
