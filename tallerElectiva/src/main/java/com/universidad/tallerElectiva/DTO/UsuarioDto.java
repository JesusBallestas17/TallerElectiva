package com.universidad.tallerElectiva.DTO;


//Le puse Final ya que son variables que no van a cambiar
public class UsuarioDto {
    private final String nombre;
    private final String apellido;

    public UsuarioDto(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
