package co.edu.unbosque.service;

import java.util.ArrayList;

import co.edu.unbosque.exception.EstudianteNoExisteException;
import co.edu.unbosque.model.DataMapper;
import co.edu.unbosque.model.Estudiante;
import co.edu.unbosque.model.EstudianteDto;
import co.edu.unbosque.model.persistence.EstudianteDao;
import co.edu.unbosque.model.persistence.EstudianteDaoInterface;

public class ServicioRegistro {

	private EstudianteDaoInterface<Estudiante, String> estudianteDao;
	public ServicioRegistro() {
		estudianteDao = new EstudianteDao();
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
	
	public ArrayList<Estudiante> consultarTodoRegistro(EstudianteDto estudianteDto) throws EstudianteNoExisteException {
		return estudianteDao.consultarResgitro();
	}
	
}
