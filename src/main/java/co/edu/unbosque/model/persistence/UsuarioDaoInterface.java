package co.edu.unbosque.model.persistence;

public interface UsuarioDaoInterface <T,K>{
    T read(K k);
    void update(T t);
}
