package es.uah.ismael.fbm.usuariosCriticasServer.service;

import es.uah.ismael.fbm.usuariosCriticasServer.model.Critica;

import java.util.List;

public interface ICriticaService {

    List<Critica> buscarTodas();

    List<Critica> buscarCriticasPorIdUsuario(Integer idUsuario);

    List<Critica> buscarCriticasPorIdPelicula(Integer idPelicula);

    Critica buscarCriticaPorId(Integer idCritica);

    void guardarCritica(Critica critica);

    void actualizarCritica(Critica critica);

    void eliminarCritica(Integer idCritica);

    Double calcularNotaMediaDePelicula(Integer idPelicula);
}
