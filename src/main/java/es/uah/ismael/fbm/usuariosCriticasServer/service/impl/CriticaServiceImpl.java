package es.uah.ismael.fbm.usuariosCriticasServer.service.impl;

import es.uah.ismael.fbm.usuariosCriticasServer.dao.ICriticaDAO;
import es.uah.ismael.fbm.usuariosCriticasServer.model.Critica;
import es.uah.ismael.fbm.usuariosCriticasServer.service.ICriticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CriticaServiceImpl implements ICriticaService {

    @Autowired
    ICriticaDAO criticaDAO;

    @Override
    public List<Critica> buscarTodas() {
        return criticaDAO.buscarTodas();
    }

    @Override
    public List<Critica> buscarCriticasPorIdUsuario(Integer idUsuario) {
        return criticaDAO.buscarCriticasPorIdUsuario(idUsuario);
    }

    @Override
    public List<Critica> buscarCriticasPorIdPelicula(Integer idPelicula) {
        return criticaDAO.buscarCriticasPorIdPelicula(idPelicula);
    }

    @Override
    public Critica buscarCriticaPorId(Integer idCritica) {
        return criticaDAO.buscarCriticaPorId(idCritica);
    }

    @Override
    public void guardarCritica(Critica critica) {
        criticaDAO.guardarCritica(critica);
    }

    @Override
    public void actualizarCritica(Critica critica) {
        criticaDAO.actualizarCritica(critica);
    }

    @Override
    public void eliminarCritica(Integer idCritica) {
        criticaDAO.eliminarCritica(idCritica);
    }

    @Override
    public Double calcularNotaMediaDePelicula(Integer idPelicula) {
        Double notaMedia = criticaDAO.calcularNotaMediaDePelicula(idPelicula);
        if (notaMedia == null) {
            return 0.0;
        }
        return Math.round(notaMedia * 100.0) / 100.0;
    }
}
