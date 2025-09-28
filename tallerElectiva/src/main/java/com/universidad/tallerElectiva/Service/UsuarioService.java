package com.universidad.tallerElectiva.Service;

import com.universidad.tallerElectiva.Model.Usuario;
import com.universidad.tallerElectiva.DTO.UsuarioDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

    public List<UsuarioDto> listaUsuarios(){
        return usuarios.stream()
                .map(u -> new UsuarioDto(u.getNombre().toUpperCase(),u.getApellido().toUpperCase())).collect(Collectors.toList());
    }

    public Optional<UsuarioDto> obtenerId(int id){
        return usuarios.stream()
                .filter(usuario -> usuario.getId() == id)
                .map(usuario -> new UsuarioDto(usuario.getNombre().toUpperCase(), usuario.getApellido().toUpperCase()))
                .findFirst();
    }

}
