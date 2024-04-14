package co.edu.unbosque.model;

import java.util.ArrayList;

public class DataMapper {

	//estudiante
	public static EstudianteDto deEstudianteADto(Estudiante estudiante) {
		 EstudianteDto aux = new EstudianteDto(estudiante.getNombre(), estudiante.getCedula(),estudiante.getApellido(), estudiante.getPrograma(), estudiante.getCreado_por());
		 return aux;
		}
	public static Estudiante deDtoAEstudiante(EstudianteDto estudianteDto) {
	 Estudiante aux = new Estudiante(estudianteDto.getNombre(), estudianteDto.getCedula(),estudianteDto.getApellido(), estudianteDto.getPrograma(), estudianteDto.getCreado_por());
	 return aux;
	 }
	public static ArrayList<EstudianteDto> deArrayAEstudiantesADto(ArrayList<Estudiante> estudiantes){
		ArrayList<EstudianteDto> aux = new ArrayList<EstudianteDto>();
		for (Estudiante auxDto : estudiantes) {
			aux.add(deEstudianteADto(auxDto));
		}
		return aux;
	}
public static ArrayList<Estudiante> deArrayDtoAEstudiantes(ArrayList<EstudianteDto> estudiantesDto){
		ArrayList<Estudiante> aux = new ArrayList<Estudiante>();
		for (EstudianteDto auxDto : estudiantesDto) {
			aux.add(deDtoAEstudiante(auxDto));
		}
		return aux;
	}

	//Usuario

	public static UsuarioDto deUsuarioADto(Usuario usuario) {
		UsuarioDto aux = new UsuarioDto(usuario.getUsuario(), usuario.getPassword(),usuario.getLastLogin());
		return aux;
	}

	public static Usuario deDtoAUsuario(UsuarioDto usuarioDto) {
		Usuario aux = new Usuario(usuarioDto.getUsuario(), usuarioDto.getPassword(), usuarioDto.getLastLogin());
		return aux;
	}

}