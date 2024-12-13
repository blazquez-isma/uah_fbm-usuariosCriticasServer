package es.uah.ismael.fbm.usuariosCriticasServer.dao.impl;

import es.uah.ismael.fbm.usuariosCriticasServer.dao.IUsuarioDAO;
import es.uah.ismael.fbm.usuariosCriticasServer.dao.repository.ICriticaRepository;
import es.uah.ismael.fbm.usuariosCriticasServer.dao.repository.IUsuarioRepository;
import es.uah.ismael.fbm.usuariosCriticasServer.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
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
        return null;
    }

    @Override
    public Usuario buscarUsuarioPorId(Integer idUsuario) {
        return null;
    }

    @Override
    public Usuario buscarUsuarioPorNombre(String nombre) {
        return null;
    }

    @Override
    public Usuario buscarUsuarioPorCorreo(String correo) {
        return null;
    }

    @Override
    public void guardarUsuario(Usuario usuario) {

    }

    @Override
    public void eliminarUsuario(Integer idUsuario) {

    }

    @Override
    public void actualizarUsuario(Usuario usuario) {

    }

    @Override
    public void eliminarCritica(Integer idUsuario, Integer idCritica) {

    }
}
