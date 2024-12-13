package es.uah.ismael.fbm.usuariosCriticasServer.controller;

import es.uah.ismael.fbm.usuariosCriticasServer.model.Rol;
import es.uah.ismael.fbm.usuariosCriticasServer.service.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RolController {

    @Autowired
    IRolService rolService;

    @GetMapping("/roles")
    public List<Rol> buscarTodos() {
        return rolService.buscarTodos();
    }

    @GetMapping("/roles/{idRol}")
    public Rol buscarRolPorId(@PathVariable("id") Integer idRol) {
        return rolService.buscarRolPorId(idRol);
    }

    @PostMapping("/roles")
    public void guardarRol(@RequestBody Rol rol) {
        rolService.guardarRol(rol);
    }

    @DeleteMapping("/roles/{idRol}")
    public void eliminarRol(@PathVariable("idRol") Integer idRol) {
        rolService.eliminarRol(idRol);
    }

}
