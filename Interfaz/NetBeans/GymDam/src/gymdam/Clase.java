/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymdam;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Abel, Aitor, Yaasin
 * @version v.5
 */
public class Clase {
    private int id;
    private String ubicacion;
    private String nombre;
    private int capacidad;
    private String monitor;
    private String descripcion;
    private LocalDate fecha;
    private LocalTime hora;  
    
    public Clase(){
        
    }
    
    public Clase(int id, String ubicacion, String nombre, int capacidad, String monitor, String descripcion, LocalDate fecha, LocalTime hora){
        this.id = id;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.monitor = monitor;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
    }

    
    public Clase(String ubicacion, String nombre, int capacidad, String monitor, String descripcion, LocalDate fecha, LocalTime hora){
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.monitor = monitor;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
    @Override
    public String toString() {
        return "{" +
                "\"ubicacion\" :\"" + ubicacion + '\"' +
                ", \"nombre\" :\"" + nombre + '\"' +
                ", \"capacidad\" :" + capacidad +
                ", \"monitor\" :\"" + monitor + '\"' +
                ", \"descripcion\" :\"" + descripcion + '\"' +
                ", \"fecha\" :\"" + fecha + '\"' +
                ", \"hora\" :\"" + hora + '\"' +
                '}';
                
    }
}

