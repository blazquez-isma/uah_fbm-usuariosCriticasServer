package es.uah.ismael.fbm.usuariosCriticasServer.dao.impl;

import es.uah.ismael.fbm.usuariosCriticasServer.dao.IUsuarioDAO;
import es.uah.ismael.fbm.usuariosCriticasServer.dao.repository.ICriticaRepository;
import es.uah.ismael.fbm.usuariosCriticasServer.dao.repository.IUsuarioRepository;
import es.uah.ismael.fbm.usuariosCriticasServer.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioDAOImpl implements IUsuarioDAO {

    @Autowired
    IUsuarioRepository usuarioRepository;

    @Autowired
    ICriticaRepository criticaRepository;

    @Override
    public List<Usuario> buscarTodos() {
        //findAll order by Usuario.nombre
        return usuarioRepository.findAll(Sort.by(Sort.Direction.ASC, "nombre"));
    }

    @Override
    public Usuario buscarUsuarioPorId(Integer idUsuario) {
        return usuarioRepository.findById(idUsuario).orElse(null);
    }

    @Override
    public Usuario buscarUsuarioPorNombre(String nombre) {
        return usuarioRepository.findByNombre(nombre);
    }

    @Override
    public Usuario buscarUsuarioPorCorreo(String correo) {
        return usuarioRepository.findByCorreo(correo);
    }

    @Override
    public Usuario buscarUsuarioPorNombreYClave(String nombre, String clave) {
        return usuarioRepository.findByNombreAndClave(nombre, clave);
    }

    @Override
    public Usuario buscarUsuarioPorCorreoYClave(String correo, String clave) {
        return usuarioRepository.findByCorreoAndClave(correo, clave);
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void eliminarUsuario(Integer idUsuario) {
        usuarioRepository.deleteById(idUsuario);
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void eliminarCritica(Integer idUsuario, Integer idCritica) {
        criticaRepository.deleteByIdCriticaAndUsuarioIdUsuario(idCritica, idUsuario);
    }
}
