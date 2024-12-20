package es.uah.ismael.fbm.usuariosCriticasServer.dao.impl;

import es.uah.ismael.fbm.usuariosCriticasServer.dao.ICriticaDAO;
import es.uah.ismael.fbm.usuariosCriticasServer.dao.repository.ICriticaRepository;
import es.uah.ismael.fbm.usuariosCriticasServer.model.Critica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CriticaDAOImpl implements ICriticaDAO {

    @Autowired
    ICriticaRepository criticaRepository;

    @Override
    public List<Critica> buscarTodas() {
        return criticaRepository.findAll();
    }

    @Override
    public List<Critica> buscarCriticasPorIdUsuario(Integer idUsuario) {
        return criticaRepository.findByUsuarioIdUsuario(idUsuario);
    }

    @Override
    public List<Critica> buscarCriticasPorIdPelicula(Integer idPelicula) {
        return criticaRepository.findByIdPelicula(idPelicula);
    }

    @Override
    public Critica buscarCriticaPorId(Integer idCritica) {
        Optional<Critica> optional = criticaRepository.findById(idCritica);
        return optional.orElse(null);
    }

    @Override
    public void guardarCritica(Critica critica) {
        criticaRepository.save(critica);
    }

    @Override
    public void actualizarCritica(Critica critica) {
        criticaRepository.save(critica);
    }

    @Override
    public void eliminarCritica(Integer idCritica) {
        criticaRepository.deleteById(idCritica);
    }

    @Override
    public Double calcularNotaMediaDePelicula(Integer idPelicula) {
        return criticaRepository.calcularNotaMediaDePelicula(idPelicula);
    }

}
