package co.edu.unbosque.visual;


import co.edu.unbosque.model.EstudianteDto;
import co.edu.unbosque.model.UsuarioDto;
import co.edu.unbosque.service.ServicioLogin;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
@Named(value = "loginBean")
@RequestScoped
public class LoginBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private UsuarioDto usuario;
    @Inject
    private ServicioLogin servicioLogin;
    @PostConstruct
    public void init() {
        usuario = new UsuarioDto();
    }
    public String validacionUsuario(){
       if(servicioLogin.validarUsuario(usuario.getUsuario(),usuario.getPassword())){
           System.out.println(usuario);
        return "formulario.xhtml";}
       else{
        System.out.println(usuario);
           return "login.xhtml";}

    }

    public UsuarioDto getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDto usuario) {
        this.usuario = usuario;
    }

    public ServicioLogin getServicioLogin() {
        return servicioLogin;
    }

    public void setServicioLogin(ServicioLogin servicioLogin) {
        this.servicioLogin = servicioLogin;
    }
}
