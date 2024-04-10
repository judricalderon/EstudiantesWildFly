package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.exception.EstudianteNoExisteException;
import co.edu.unbosque.model.Estudiante;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;

@Stateless
public class EstudianteDao implements EstudianteDaoInterface<Estudiante, String> {
	@PersistenceContext (unitName="estudiantesPU")
	private EntityManager manager;


	@Override
	public void crear(Estudiante t) {
	//	DataSource.crearEstudiante(t);
		manager.persist(t);
		
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
