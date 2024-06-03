package models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Colaborador {

    private String rutColaborador;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String direccion;
    private String comuna;
    private String telefono;
    private int rol;

    @Id
    @GeneratedValue
    private int id;

    //constructor vacio
    public Colaborador(){}

    //constructor con parametros
    public Colaborador(String rutColaborador, String nombre, String primerApellido, String segundoApellido, String direccion, String comuna, String telefono, int rol ){
        super();
        this.rutColaborador = rutColaborador;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.direccion = direccion;
        this.comuna = comuna;
        this.telefono = telefono;
        this.rol = rol;

    }

    //getters and setters

    public String getRutColaborador() {
        return rutColaborador;
    }
    public void setRutColaborador(String rutColaborador) {
        this.rutColaborador = rutColaborador;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPrimerApellido() {
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public String getSegundoApellido() {
        return segundoApellido;
    }
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getComuna() {
        return comuna;
    }
    public String setTelefono(String telefono) {
        this.telefono = telefono;
        return telefono;
    }
    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Colaborador [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
                + ", direccion=" + direccion + "]";
    }
}
