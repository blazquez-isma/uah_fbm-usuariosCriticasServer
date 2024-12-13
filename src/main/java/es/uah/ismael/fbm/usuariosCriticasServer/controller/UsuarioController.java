package es.uah.ismael.fbm.usuariosCriticasServer.controller;

import es.uah.ismael.fbm.usuariosCriticasServer.model.Usuario;
import es.uah.ismael.fbm.usuariosCriticasServer.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    IUsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> buscarTodos() {
        return usuarioService.buscarTodos();
    }

    @GetMapping("/usuarios/{idUsuario}")
    public Usuario buscarUsuarioPorId(@PathVariable("id") Integer idUsuario) {
        return usuarioService.buscarUsuarioPorId(idUsuario);
    }

    @GetMapping("/usuarios/nombre/{nombre}")
    public Usuario buscarUsuarioPorNombre(@PathVariable("nombre") String nombre) {
        return usuarioService.buscarUsuarioPorNombre(nombre);
    }

    @GetMapping("/usuarios/correo/{correo}")
    public Usuario buscarUsuarioPorCorreo(@PathVariable("correo") String correo) {
        return usuarioService.buscarUsuarioPorCorreo(correo);
    }

    @PostMapping("/usuarios")
    public void guardarUsuario(@RequestBody Usuario usuario) {
        usuarioService.guardarUsuario(usuario);
    }

    @PutMapping("/usuarios")
    public void actualizarUsuario(@RequestBody Usuario usuario) {
        usuarioService.actualizarUsuario(usuario);
    }

    @DeleteMapping("/usuarios/{idUsuario}")
    public void eliminarUsuario(@PathVariable("id") Integer idUsuario) {
        usuarioService.eliminarUsuario(idUsuario);
    }

}