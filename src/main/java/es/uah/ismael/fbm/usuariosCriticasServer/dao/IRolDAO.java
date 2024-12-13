package es.uah.ismael.fbm.usuariosCriticasServer.dao;

import es.uah.ismael.fbm.usuariosCriticasServer.model.Rol;

import java.util.List;

public interface IRolDAO {

    List<Rol> buscarTodos();

    Rol buscarRolPorId(Integer idRol);

    void guardarRol(Rol rol);

    void eliminarRol(Integer idRol);

}
