package co.edu.unbosque.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class Usuario {
    @Id
    @Column (name="user_name")
    private String usuario;
    @Column (name="user_pwd ")
    private String password;
    @Column (name = "last_login ")
    private LocalDateTime lastLogin;

    public Usuario() {
    }

    public Usuario(String usuario,String password, LocalDateTime lastLogin) {
        this.password = password;
        this.usuario = usuario;
        this.lastLogin = lastLogin;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }
}
