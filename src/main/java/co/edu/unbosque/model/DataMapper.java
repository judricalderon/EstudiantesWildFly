package co.edu.unbosque.model;

import java.util.ArrayList;

public class DataMapper {

	
	public static EstudianteDto deEstudianteADto(Estudiante estudiante) {
		 EstudianteDto aux = new EstudianteDto(estudiante.getNombre(), estudiante.getCedula(), estudiante.getPrograma(), estudiante.getCorreo(), estudiante.getFechaIngreso());
		 return aux;
		}



	public static Estudiante deDtoAEstudiante(EstudianteDto estudianteDto) {
	 Estudiante aux = new Estudiante(estudianteDto.getNombre(), estudianteDto.getCedula(), estudianteDto.getPrograma(), estudianteDto.getCorreo(), estudianteDto.getFechaIngreso());
	 return aux;
	}
	
	public static ArrayList<Estudiante> deArrayDtoAEstudiantes(ArrayList<EstudianteDto> estudiantesDto){
		ArrayList<Estudiante> aux = new ArrayList<Estudiante>();
		for (EstudianteDto auxDto : estudiantesDto) {
			aux.add(deDtoAEstudiante(auxDto));
		}
		return aux;
	}
	
	public static ArrayList<EstudianteDto> deArrayAEstudiantesADto(ArrayList<Estudiante> estudiantes){
		ArrayList<EstudianteDto> aux = new ArrayList<EstudianteDto>();
		for (Estudiante auxDto : estudiantes) {
			aux.add(deEstudianteADto(auxDto));
		}
		return aux;
	}
}