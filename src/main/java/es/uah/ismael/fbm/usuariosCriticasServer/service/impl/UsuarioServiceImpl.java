package es.uah.ismael.fbm.usuariosCriticasServer.service.impl;

import es.uah.ismael.fbm.usuariosCriticasServer.dao.IUsuarioDAO;
import es.uah.ismael.fbm.usuariosCriticasServer.model.Usuario;
import es.uah.ismael.fbm.usuariosCriticasServer.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    IUsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> buscarTodos() {
        return usuarioDAO.buscarTodos();
    }

    @Override
    public Usuario buscarUsuarioPorId(Integer idUsuario) {
        return usuarioDAO.buscarUsuarioPorId(idUsuario);
    }

    @Override
    public Usuario buscarUsuarioPorNombre(String nombre) {
        return usuarioDAO.buscarUsuarioPorNombre(nombre);
    }

    @Override
    public Usuario buscarUsuarioPorCorreo(String correo) {
        return usuarioDAO.buscarUsuarioPorCorreo(correo);
    }

    @Override
    public Usuario buscarUsuarioPorNombreYClave(String nombre, String clave) {
        return usuarioDAO.buscarUsuarioPorNombreYClave(nombre, clave);
    }

    @Override
    public Usuario buscarUsuarioPorCorreoYClave(String correo, String clave) {
        return usuarioDAO.buscarUsuarioPorCorreoYClave(correo, clave);
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
        usuarioDAO.guardarUsuario(usuario);
    }

    @Override
    public void eliminarUsuario(Integer idUsuario) {
        usuarioDAO.eliminarUsuario(idUsuario);
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        usuarioDAO.actualizarUsuario(usuario);
    }

    @Override
    public void eliminarCritica(Integer idUsuario, Integer idCritica) {
        usuarioDAO.eliminarCritica(idUsuario, idCritica);
    }
}
