package co.edu.unbosque.model.persistence;

import co.edu.unbosque.exception.EstudianteNoExisteException;

public interface UsuarioDaoInterface <T,K>{
    T consultar(K k);
}
