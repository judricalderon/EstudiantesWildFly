package co.edu.unbosque.model;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class UsuarioDto {
    private String usuario;
    private String password;
    private LocalDateTime lastLogin;



     public UsuarioDto(String usuario,String password, LocalDateTime lastLogin) {
        this.password = password;
        this.usuario = usuario;
        this.lastLogin = lastLogin;
    }

    public UsuarioDto() {

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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "UsuarioDto{" +
                "usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                ", lastLogin=" + lastLogin +
                '}';
    }
}
