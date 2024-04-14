package co.edu.unbosque.visual;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.io.Serializable;
@Named(value = "menuBean")
@RequestScoped
public class MenuBean implements Serializable {

    private static final long serialVersionUID = 1L;

public String redireccionarCrearModificar(){

    return "formularioCrearModificar.xhtml";
}
    public String redireccionarBorrarConsultar(){
        return "formularioBorrarConsultar.xhtml";
    }

}
