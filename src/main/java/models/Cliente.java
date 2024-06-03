package models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Cliente {

    // usamos la tabla de nuestra base de datos

    private String rutCliente;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String direccion;
    private String comuna;
    private String telefono;
    private String email;
    private String puntos;

    @Id
    @GeneratedValue
    private int id;

    //Constructor vacio

    public Cliente() {

    }

    //constructor con parametros
    public Cliente(String rutCliente, String nombre, String primerApellido, String segundoApellido, String direccion, String comuna, String telefono, String email, String puntos, int id) {
        super();
        this.rutCliente = rutCliente;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.direccion = direccion;
        this.comuna = comuna;
        this.telefono = telefono;
        this.email = email;
        this.puntos = puntos;
        this.id= id;

    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
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
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {

    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPuntos() {
        return puntos;
    }
    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //@Overrida es anotación de sobre escritura
    @Override
    public String toString() {
        return "Cliente [rutCliente=" + rutCliente + ", nombre=" + nombre
                + ", primerApellido=" + primerApellido + ", segundoApellido="
                + ", direccion=" + direccion + ", comuna=" + comuna + ", telefono="
                + telefono + ", email=" + email + ", puntos=" + puntos + "]";
    }
}

