package es.uah.ismael.fbm.usuariosCriticasServer.service.impl;

import es.uah.ismael.fbm.usuariosCriticasServer.dao.IRolDAO;
import es.uah.ismael.fbm.usuariosCriticasServer.model.Rol;
import es.uah.ismael.fbm.usuariosCriticasServer.service.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImpl implements IRolService {

    @Autowired
    private IRolDAO rolDAO;

    @Override
    public List<Rol> buscarTodos() {
        return rolDAO.buscarTodos();
    }

    @Override
    public Rol buscarRolPorId(Integer idRol) {
        return rolDAO.buscarRolPorId(idRol);
    }

    @Override
    public void guardarRol(Rol rol) {
        rolDAO.guardarRol(rol);
    }

    @Override
    public void eliminarRol(Integer idRol) {
        rolDAO.eliminarRol(idRol);
    }
}
