package es.uah.ismael.fbm.usuariosCriticasServer.dao.repository;

import es.uah.ismael.fbm.usuariosCriticasServer.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByNombre(String nombre);

    Usuario findByCorreo(String correo);

    Usuario findByNombreAndClave(String nombre, String clave);

    Usuario findByCorreoAndClave(String correo, String clave);
}
