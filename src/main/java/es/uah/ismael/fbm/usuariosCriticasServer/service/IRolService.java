package es.uah.ismael.fbm.usuariosCriticasServer.service;

import es.uah.ismael.fbm.usuariosCriticasServer.model.Rol;

import java.util.List;

public interface IRolService {

        List<Rol> buscarTodos();

        Rol buscarRolPorId(Integer idRol);

        void guardarRol(Rol rol);

        void eliminarRol(Integer idRol);
}
