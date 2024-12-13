package es.uah.ismael.fbm.usuariosCriticasServer.dao.impl;

import es.uah.ismael.fbm.usuariosCriticasServer.dao.IRolDAO;
import es.uah.ismael.fbm.usuariosCriticasServer.dao.repository.IRolRepository;
import es.uah.ismael.fbm.usuariosCriticasServer.model.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RolDAOImpl implements IRolDAO {

    @Autowired
    IRolRepository rolRepository;

    @Override
    public List<Rol> buscarTodos() {
        return rolRepository.findAll();
    }

    @Override
    public Rol buscarRolPorId(Integer idRol) {
        Optional<Rol> optional = rolRepository.findById(idRol);
        return optional.orElse(null);
    }

    @Override
    public void guardarRol(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public void eliminarRol(Integer idRol) {
        rolRepository.deleteById(idRol);
    }
}
