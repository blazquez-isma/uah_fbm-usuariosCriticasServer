package es.uah.ismael.fbm.usuariosCriticasServer.dao;

import es.uah.ismael.fbm.usuariosCriticasServer.model.Usuario;

import java.util.List;

public interface IUsuarioDAO {

    List<Usuario> buscarTodos();

    Usuario buscarUsuarioPorId(Integer idUsuario);

    Usuario buscarUsuarioPorNombre(String nombre);

    Usuario buscarUsuarioPorCorreo(String correo);

    void guardarUsuario(Usuario usuario);

    void eliminarUsuario(Integer idUsuario);

    void actualizarUsuario(Usuario usuario);

    void eliminarCritica(Integer idUsuario, Integer idCritica);
}
