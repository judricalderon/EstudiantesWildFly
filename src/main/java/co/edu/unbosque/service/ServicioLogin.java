package co.edu.unbosque.service;

import co.edu.unbosque.model.DataMapper;
import co.edu.unbosque.model.Estudiante;
import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.model.UsuarioDto;
import co.edu.unbosque.model.persistence.EstudianteDaoInterface;
import co.edu.unbosque.model.persistence.UsuarioDaoInterface;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class ServicioLogin {
    @Inject
    private UsuarioDaoInterface<Usuario, String> usuarioDao;

    public boolean validarUsuario(String usuario, String password) {

        UsuarioDto aux = DataMapper.deUsuarioADto(usuarioDao.consultar(usuario));
        return aux.getPassword().equals(password) && aux.getUsuario().equals(usuario);
    }
}
