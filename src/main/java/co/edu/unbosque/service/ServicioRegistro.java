package co.edu.unbosque.service;

import java.util.ArrayList;

import co.edu.unbosque.exception.EstudianteNoExisteException;
import co.edu.unbosque.model.DataMapper;
import co.edu.unbosque.model.Estudiante;
import co.edu.unbosque.model.EstudianteDto;
import co.edu.unbosque.model.persistence.EstudianteDao;
import co.edu.unbosque.model.persistence.EstudianteDaoInterface;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
@Stateless
public class ServicioRegistro {
	@Inject
	private EstudianteDaoInterface<Estudiante, String> estudianteDao;

	public ServicioRegistro() {

	}
	
	public void registrarEstudiante(EstudianteDto estudianteDto) {
		
		estudianteDao.crear(DataMapper.deDtoAEstudiante(estudianteDto));
	}
	public void modificarRegistroEstudiante(EstudianteDto estudianteDto) throws EstudianteNoExisteException {
		estudianteDao.modificar(DataMapper.deDtoAEstudiante(estudianteDto));
	}
	
	public Estudiante consultarRegistroEstudiante(EstudianteDto estudianteDto) throws EstudianteNoExisteException {
		return estudianteDao.consultar(DataMapper.deDtoAEstudiante(estudianteDto).getCedula());
	}
	
	public ArrayList<EstudianteDto> consultarTodoRegistro() throws EstudianteNoExisteException {
		return DataMapper.deArrayAEstudiantesADto(estudianteDao.consultarResgitro());
	}
	
}
