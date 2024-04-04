package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.exception.EstudianteNoExisteException;
import co.edu.unbosque.model.Estudiante;

public class EstudianteDao implements EstudianteDaoInterface<Estudiante, String> {

	@Override
	public void crear(Estudiante t) {
		DataSource.crearEstudiante(t);
		
	}

	@Override
	public void modificar(Estudiante t) throws EstudianteNoExisteException  {
		DataSource.modificarEstudiante(t);
		
	}

	@Override
	public Estudiante consultar(String k) throws EstudianteNoExisteException {
		Estudiante aux =DataSource.consultarEstudiante(k);
		return aux;
	}

	@Override
	public ArrayList<Estudiante> consultarResgitro() throws EstudianteNoExisteException {
		
		return DataSource.registroEstudiantes;
	}

}
