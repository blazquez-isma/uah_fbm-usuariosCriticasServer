package es.uah.ismael.fbm.usuariosCriticasServer.dao.repository;

import es.uah.ismael.fbm.usuariosCriticasServer.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRolRepository extends JpaRepository<Rol, Integer> {
}
