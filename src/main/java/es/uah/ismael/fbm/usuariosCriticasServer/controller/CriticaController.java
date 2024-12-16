package es.uah.ismael.fbm.usuariosCriticasServer.controller;

import es.uah.ismael.fbm.usuariosCriticasServer.model.Critica;
import es.uah.ismael.fbm.usuariosCriticasServer.service.ICriticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CriticaController {

    @Autowired
    private ICriticaService criticaService;

    @GetMapping("/criticas")
    public List<Critica> buscarTodas() {
        return criticaService.buscarTodas();
    }

    @GetMapping("/criticas/{id}")
    public Critica buscarCriticaPorId(@PathVariable("id") Integer idCritica) {
        return criticaService.buscarCriticaPorId(idCritica);
    }

    @GetMapping("/criticas/usuario/{idUsuario}")
    public List<Critica> buscarCriticasPorUsuario(@PathVariable("idUsuario") Integer idUsuario) {
        return criticaService.buscarCriticasPorIdUsuario(idUsuario);
    }

    @GetMapping("/criticas/pelicula/{idPelicula}")
    public List<Critica> buscarCriticasPorPelicula(@PathVariable("idPelicula") Integer idPelicula) {
        return criticaService.buscarCriticasPorIdPelicula(idPelicula);
    }

    @PostMapping("/criticas")
    public void guardarCritica(@RequestBody Critica critica) {
        criticaService.guardarCritica(critica);
    }

    @DeleteMapping("/criticas/{idCritica}")
    public void eliminarCritica(@PathVariable("idCritica") Integer idCritica) {
        criticaService.eliminarCritica(idCritica);
    }

}
