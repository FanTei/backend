package home_file_server.home_file_server.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import javax.persistence.*
import kotlin.math.log

@Entity
@Table(name = "t_user")
class User : UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null

    @Column(name = "login", nullable = false)
    var login: String? = null

    @JvmField
    @Column(name = "password", nullable = false)
    var password: String? = null

    @Column(name = "roles", nullable = false)
    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    var roles: MutableSet<Role>? = null

    override fun getAuthorities(): MutableSet<Role>? {
        return roles
    }

    override fun getPassword(): String? {
        return password
    }

    override fun getUsername(): String? {
        return login
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return true
    }

}