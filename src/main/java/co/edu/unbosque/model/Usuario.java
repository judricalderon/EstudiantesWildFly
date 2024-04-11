package co.edu.unbosque.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @Column (name="user_name")
    private String usuario;
    @Column (name="password_name")
    private String password;

    public Usuario() {
    }

    public Usuario(String usuario, String password ) {
        this.usuario = usuario;
        this.password = password;
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
