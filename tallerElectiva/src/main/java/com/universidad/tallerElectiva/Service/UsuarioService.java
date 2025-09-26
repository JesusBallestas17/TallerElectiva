package com.universidad.tallerElectiva.Service;

import com.universidad.tallerElectiva.Model.Usuario;
import com.universidad.tallerElectiva.DTO.UsuarioDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;

@Service
public class UsuarioService {

    private List<Usuario> usuarios= new ArrayList<>();

    public UsuarioService(){
        usuarios.add(new Usuario(1,"Jesus","ballestas","jdbc1@gmail.com"));
        usuarios.add(new Usuario(2,"juan","trespalacios","juanTre@gmail.com"));
        usuarios.add(new Usuario(3,"juan","vergara","juanV2@gmail.com"));
        usuarios.add(new Usuario(4,"weyder","aguirre","weymejia@gmail.com"));
    }

    public UsuarioDto crearUsuarios(Usuario usuario){
        usuarios.add(usuario);
        return new UsuarioDto(usuario.getNombre().toUpperCase(), usuario.getApellido().toUpperCase());

    }

}
