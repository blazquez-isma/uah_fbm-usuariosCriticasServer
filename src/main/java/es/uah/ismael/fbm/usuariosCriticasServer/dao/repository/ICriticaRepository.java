package es.uah.ismael.fbm.usuariosCriticasServer.dao.repository;

import es.uah.ismael.fbm.usuariosCriticasServer.model.Critica;
import es.uah.ismael.fbm.usuariosCriticasServer.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICriticaRepository extends JpaRepository<Critica, Integer> {

    List<Critica> findByUsuarioIdUsuario(Integer idUsuario);

    List<Critica> findByIdPelicula(Integer idPelicula);

}
