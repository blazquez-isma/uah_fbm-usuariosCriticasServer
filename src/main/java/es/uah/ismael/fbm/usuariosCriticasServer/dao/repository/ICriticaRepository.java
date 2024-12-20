package es.uah.ismael.fbm.usuariosCriticasServer.dao.repository;

import es.uah.ismael.fbm.usuariosCriticasServer.model.Critica;
import es.uah.ismael.fbm.usuariosCriticasServer.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICriticaRepository extends JpaRepository<Critica, Integer> {

    List<Critica> findByUsuarioIdUsuario(Integer idUsuario);

    List<Critica> findByIdPelicula(Integer idPelicula);

    void deleteByIdCriticaAndUsuarioIdUsuario(Integer idCritica, Integer idUsuario);

    @Query("SELECT AVG(c.nota) FROM Critica c WHERE c.idPelicula = :idPelicula")
    Double calcularNotaMediaDePelicula(Integer idPelicula);
}
