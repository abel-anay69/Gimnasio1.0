/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymdam;

/**
 *
 * @author Abel, Aitor, Yaasin
 * @version v.5
 */
public class Cliente {
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private int telefono;
    
    public Cliente() {
        
    }

    public Cliente(String dni, String nombre, String apellidos, String direccion, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "{" +
                "\"dni\" :\"" + dni + '\"' +
                ", \"nombre\" :\"" + nombre + '\"' +
                ", \"apellidos\" :\"" + apellidos + '\"' +
                ", \"direccion\" :\"" + direccion + '\"' +
                ", \"telefono\" :" + telefono +
                '}';
                
    }
    
    
}
