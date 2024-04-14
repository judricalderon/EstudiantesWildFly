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
	public void create(Estudiante t) {
	//	DataSource.crearEstudiante(t);
		manager.persist(t);
		
	}

	@Override
	public void Update(Estudiante t) throws EstudianteNoExisteException  {
		manager.merge(t);
	}

	@Override
	public Estudiante read(String k) throws EstudianteNoExisteException {

		return manager.find(Estudiante.class, k);
	}

	@Override
	public void delete(String s) throws EstudianteNoExisteException {
	manager.remove(read(s));

	}

	@Override
	public ArrayList<Estudiante> consultarResgitro() throws EstudianteNoExisteException {
		
		//return DataSource.registroEstudiantes;
	return null;
	}

}
