package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.Usuario;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class UsuarioDao implements UsuarioDaoInterface<Usuario,String>{

    @PersistenceContext(unitName="estudiantesPU") //preguntar si va el mismo nombre
    private EntityManager manager;


    @Override
    public Usuario consultar(String s) {

        return manager.find(Usuario.class, s);
    }
}
