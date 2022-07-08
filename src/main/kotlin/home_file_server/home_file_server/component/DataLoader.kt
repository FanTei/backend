package home_file_server.home_file_server.component

import home_file_server.home_file_server.entity.Role
import home_file_server.home_file_server.repository.RoleRepository
import org.springframework.stereotype.Component

@Component
class DataLoader(
    private final val roleRepository: RoleRepository
) {

    init {
        loadRoles()
    }

    private fun loadRoles() {
        roleRepository.save(Role(1, "ROLE_USER"))
        roleRepository.save(Role(2, "ROLE_ADMIN"))
    }
}