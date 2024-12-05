package com.inmo.prueba.ProyectoCitas.Controller;

import com.inmo.prueba.ProyectoCitas.Model.Cita;
import com.inmo.prueba.ProyectoCitas.Model.Usuario;
import com.inmo.prueba.ProyectoCitas.Service.CitaService;
import com.inmo.prueba.ProyectoCitas.Service.CitaServiceImp;
import com.inmo.prueba.ProyectoCitas.Service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cita")
public class CitaController {

    private final CitaService citaService;
    private final UsuarioService usuarioService;
    public CitaController(CitaService citaService, UsuarioService usuarioService) {
        this.citaService = citaService;
        this.usuarioService = usuarioService;
    }


    @PostMapping("/{idusuario}")
    public ResponseEntity<Cita> crearCitaCliente(@PathVariable("idusuario") Integer idusuario, @RequestBody Cita cita) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(idusuario);
        Cita citaCreada =  citaService.crearCitaCliente(usuario, cita);
        return ResponseEntity.ok(citaCreada);
    }
}
