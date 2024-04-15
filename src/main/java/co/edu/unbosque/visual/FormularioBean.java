package co.edu.unbosque.visual;

import java.io.Serializable;
import java.util.ArrayList;

import co.edu.unbosque.exception.EstudianteNoExisteException;
import co.edu.unbosque.model.EstudianteDto;
import co.edu.unbosque.service.ServicioRegistro;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named (value = "formularioBean")
@ApplicationScoped
public class FormularioBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private EstudianteDto estudianteDto;
	private ArrayList<EstudianteDto> estudiantesDto;
	@Inject
	private ServicioRegistro servicioRegistro;

	
	@PostConstruct
	public void init() {
		estudianteDto = new EstudianteDto();
		estudiantesDto=new ArrayList<EstudianteDto>();
	}
	
	public String registrarEstudiante(String nombre) {
		servicioRegistro.registrarEstudiante(estudianteDto, nombre);
		System.out.println("Estudiante registrada con exito");
		return "menu.xhml";
	}
	public String modificarEstudiante() throws EstudianteNoExisteException {
        try {
            servicioRegistro.modificarRegistroEstudiante(estudianteDto);
        } catch (EstudianteNoExisteException e) {
            throw new RuntimeException(e);
        }
		return "menu.xhml";
    }
	public String borrarEstudiante(){
        try {
            servicioRegistro.borrarEstudiante(estudianteDto.getCedula());
        } catch (EstudianteNoExisteException e) {
            throw new RuntimeException(e);
        }
		return "menu.xhml";
    }
	public String mostrarEstudiante(){

        try {
            estudianteDto = servicioRegistro.mostrarEstudiante(estudianteDto.getCedula());
			System.out.println(estudianteDto);
			estudiantesDto.add(estudianteDto);
        } catch (EstudianteNoExisteException e) {
            throw new RuntimeException(e);
        }
		return "menu.xhtml";
    }

	public ArrayList<EstudianteDto> getEstudiantesDto() {
		return estudiantesDto;
	}

	public void setEstudiantesDto(ArrayList<EstudianteDto> estudiantesDto) {
		this.estudiantesDto = estudiantesDto;
	}

	public EstudianteDto getEstudianteDto() {
		return estudianteDto;
	}

	public void setEstudianteDto(EstudianteDto estudianteDto) {
		this.estudianteDto = estudianteDto;
	}

	public ServicioRegistro getServicioRegistro() {
		return servicioRegistro;
	}

	public void setServicioRegistro(ServicioRegistro servicioRegistro) {
		this.servicioRegistro = servicioRegistro;
	}


}
