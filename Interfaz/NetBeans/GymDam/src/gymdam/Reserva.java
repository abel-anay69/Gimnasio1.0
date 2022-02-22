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
public class Reserva {
    private int id;
    private String cliente_dni;
    private int clase_id;
    
    
    public Reserva(){
        
    }

    public Reserva(int id, String cliente_dni, int clase_id) {
        this.id = id;
        this.cliente_dni = cliente_dni;
        this.clase_id = clase_id;
    }

    public Reserva(String cliente_dni, int clase_id) {
        this.cliente_dni = cliente_dni;
        this.clase_id = clase_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return cliente_dni;
    }

    public void setDni(String cliente_dni) {
        this.cliente_dni = cliente_dni;
    }

    public int getIdClase() {
        return clase_id;
    }

    public void setIdClase(int clase_id) {
        this.clase_id = clase_id;
    }
    
    

    @Override
    public String toString() {
        return "{" +
                " \"cliente\" :\"" + cliente_dni + '\"' +
                ", \"clase\" :\"" + clase_id + '\"' +
                '}';
    }
    
    
    
}
