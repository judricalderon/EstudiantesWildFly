package co.edu.unbosque.visual;

import java.io.Serializable;

import co.edu.unbosque.exception.EstudianteNoExisteException;
import co.edu.unbosque.model.EstudianteDto;
import co.edu.unbosque.service.ServicioRegistro;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named (value = "formularioBean")
@RequestScoped
public class FormularioBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private EstudianteDto estudianteDto;
	@Inject
	private ServicioRegistro servicioRegistro;
	
	@PostConstruct
	public void init() {
		estudianteDto = new EstudianteDto();

	}
	
	public void registrarEstudiante() {
		servicioRegistro.registrarEstudiante(estudianteDto);
		
		try {
			for (EstudianteDto auxDto: servicioRegistro.consultarTodoRegistro()) {
				System.out.println(auxDto);
			}
		} catch (EstudianteNoExisteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
