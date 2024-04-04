package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.exception.EstudianteNoExisteException;

public interface EstudianteDaoInterface <T,K>{

	void crear(T t);
	void modificar (T t) throws EstudianteNoExisteException;
	ArrayList<T> consultarResgitro() throws EstudianteNoExisteException;
	T consultar(K k) throws EstudianteNoExisteException;
	
	
}
