/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymdam;

/**
 *
 * @author dam_aap
 */
public class Reserva {
    private int id;
    private Cliente cliente;
    private Clase clase;
    
    
    public Reserva(){
        
    }
    
    public Reserva(int id, Cliente cliente, Clase clase){
        this.id = id;
        this.cliente = cliente;
        this.clase = clase;
    }
    
    public Reserva(Cliente cliente, Clase clase){
        this.cliente = cliente;
        this.clase = clase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "{" +
                ", \"id\" :" + id +
                ", \"cliente\" :\"" + cliente.toString() + '\"' +
                ", \"clase\" :\"" + clase.toString() + '\"' +
                '}';
    }
    
    
    
}
