package home_file_server.home_file_server.entity

import org.springframework.security.core.GrantedAuthority
import javax.persistence.*


@Entity
@Table(name = "t_role")
class Role(
    id: Long, @Column(name = "name", nullable = false)
    var name: String
) : GrantedAuthority {

    @Id
    private var id: Long? = id

    @ManyToMany(mappedBy = "roles")
    var users: Set<User>? = emptySet()

    override fun getAuthority(): String {
        return name
    }
}