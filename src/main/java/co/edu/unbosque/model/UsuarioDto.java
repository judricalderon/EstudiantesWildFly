package co.edu.unbosque.model;

import jakarta.persistence.Column;

public class UsuarioDto {
    private String usuario;
    private String password;

    public UsuarioDto(String usuario,String password) {
        this.usuario = usuario;
        this.password = password;
    }
    public UsuarioDto() {

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
}
