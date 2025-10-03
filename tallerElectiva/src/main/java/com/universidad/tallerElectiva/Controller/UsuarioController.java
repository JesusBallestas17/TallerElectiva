package com.universidad.tallerElectiva.Controller;

import com.universidad.tallerElectiva.DTO.UsuarioDto;
import com.universidad.tallerElectiva.Model.Usuario;
import com.universidad.tallerElectiva.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/usuarios")
    public UsuarioDto crearUsuario(@RequestBody Usuario usuario){
        return usuarioService.crearUsuarios(usuario);
    }

    @GetMapping("/usuarios")
    public List<UsuarioDto>  listaUsuarios(){
        return usuarioService.listaUsuarios();
    }

    @GetMapping("/usuarios/{id}")
    public Optional<UsuarioDto> obtenerId(@PathVariable int id){
        return usuarioService.obtenerId(id);
    }

    @GetMapping("/usuarios/params")
    public Map<String, String> obtenerParams(@RequestParam String nombre, @RequestParam String apellido){
        Map<String, String> response = new HashMap<>();
        response.put("nombreCompleto", nombre + " " + apellido);
        return response;
    }

}
