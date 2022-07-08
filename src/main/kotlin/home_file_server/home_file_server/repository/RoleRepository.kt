package home_file_server.home_file_server.repository

import home_file_server.home_file_server.entity.Role
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RoleRepository : JpaRepository<Role,Long> {

}