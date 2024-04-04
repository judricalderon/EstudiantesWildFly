package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.exception.EstudianteNoExisteException;
import co.edu.unbosque.model.Estudiante;

public class DataSource {
	public static ArrayList<Estudiante> registroEstudiantes;

	static {
		registroEstudiantes = new ArrayList<Estudiante>();
	}

	public static void crearEstudiante(Estudiante estudiante) {
		
		registroEstudiantes.add(estudiante);
	}
	public static Estudiante consultarEstudiante(String id) throws EstudianteNoExisteException {
		
		for(Estudiante aux: registroEstudiantes) {
			if(aux.getCedula().equals(id)) {
				return aux;
			}
		}throw new EstudianteNoExisteException("No existe estudiante");
		
	}
	public static void modificarEstudiante(Estudiante estudiante) throws EstudianteNoExisteException {
		
		Estudiante aux = consultarEstudiante(estudiante.getCedula());
		registroEstudiantes.remove(consultarEstudiante(estudiante.getCedula()));
		crearEstudiante(aux);
	}
public static ArrayList<Estudiante> consultarEstudiantes() {
		
		return registroEstudiantes;
	}
}
