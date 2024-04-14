package co.edu.unbosque.service;

import co.edu.unbosque.model.DataMapper;
import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.model.UsuarioDto;
import co.edu.unbosque.model.persistence.UsuarioDaoInterface;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.time.LocalDateTime;

@Stateless
public class ServicioLogin {
    @Inject
    private UsuarioDaoInterface<Usuario, String> usuarioDao;

    public boolean validarUsuario(UsuarioDto usuarioDto) {

        UsuarioDto aux = DataMapper.deUsuarioADto(usuarioDao.read(usuarioDto.getUsuario()));
        if (aux !=null){
        if (aux.getPassword().equals(usuarioDto.getPassword()) && aux.getUsuario().equals(usuarioDto.getUsuario())){
           System.out.println("Usuario validado");
            aux.setLastLogin(LocalDateTime.now());
            usuarioDao.update(DataMapper.deDtoAUsuario(aux));
            return true;
        }
        }System.out.println("Usuario null");
        return false;
    }
}
