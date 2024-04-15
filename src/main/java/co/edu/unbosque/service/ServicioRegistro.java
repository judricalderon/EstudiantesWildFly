package co.edu.unbosque.service;

import co.edu.unbosque.exception.EstudianteNoExisteException;
import co.edu.unbosque.model.DataMapper;
import co.edu.unbosque.model.Estudiante;
import co.edu.unbosque.model.EstudianteDto;
import co.edu.unbosque.model.persistence.EstudianteDaoInterface;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
@Stateless
public class ServicioRegistro {
	@Inject
	private EstudianteDaoInterface<Estudiante, String> estudianteDao;

	public ServicioRegistro() {

	}
	
	public void registrarEstudiante(EstudianteDto estudianteDto, String nombreUsuario) {
		estudianteDto.setCreadoPor(nombreUsuario);
		estudianteDao.create(DataMapper.deDtoAEstudiante(estudianteDto));
	}

	public void modificarRegistroEstudiante(EstudianteDto estudianteDto) throws EstudianteNoExisteException {
		EstudianteDto aux = DataMapper.deEstudianteADto(estudianteDao.read(estudianteDto.getCedula()));
		aux.setNombre(estudianteDto.getNombre());
		aux.setApellido(estudianteDto.getApellido());
		aux.setPrograma(estudianteDto.getPrograma());
		estudianteDao.Update(DataMapper.deDtoAEstudiante(aux));
	}
	public void borrarEstudiante(String cedula) throws EstudianteNoExisteException {
		estudianteDao.delete(cedula);
	}
	public EstudianteDto mostrarEstudiante(String cedula) throws EstudianteNoExisteException {
		EstudianteDto estudianteDto = DataMapper.deEstudianteADto(estudianteDao.read(cedula));
		System.out.println(estudianteDto);
		return estudianteDto;
	}
	
	public Estudiante consultarRegistroEstudiante(EstudianteDto estudianteDto) throws EstudianteNoExisteException {
		return estudianteDao.read(DataMapper.deDtoAEstudiante(estudianteDto).getCedula());
	}
	

}
