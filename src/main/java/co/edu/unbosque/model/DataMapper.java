package co.edu.unbosque.model;

public class DataMapper {

	
	public static EstudianteDto deEstudianteADto(Estudiante estudiante) {
		 EstudianteDto aux = new EstudianteDto(estudiante.getNombre(), estudiante.getCedula(), estudiante.getPrograma(), estudiante.getCorreo(), estudiante.getFechaIngreso());
		 return aux;
		}



	public static Estudiante deDtoAEstudiante(EstudianteDto estudianteDto) {
	 Estudiante aux = new Estudiante(estudianteDto.getNombre(), estudianteDto.getCedula(), estudianteDto.getPrograma(), estudianteDto.getCorreo(), estudianteDto.getFechaIngreso());
	 return aux;
	}
}