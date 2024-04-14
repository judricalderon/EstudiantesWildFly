package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.exception.EstudianteNoExisteException;

public interface EstudianteDaoInterface <T,K>{

	void create(T t);
	void Update(T t) throws EstudianteNoExisteException;
	ArrayList<T> consultarResgitro() throws EstudianteNoExisteException;
	T read(K k) throws EstudianteNoExisteException;
	void delete(K k) throws EstudianteNoExisteException;
	
	
}
