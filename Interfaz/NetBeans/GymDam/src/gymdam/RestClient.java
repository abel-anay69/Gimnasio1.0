/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymdam;

import org.glassfish.jersey.*;
import org.glassfish.jersey.client.*;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import org.glassfish.hk2.api.*;

/**
 *
 * @author Abel, Aitor, Yaasin
 * @version v.5
 */
public class RestClient {
    
    Client client;
    
    public RestClient(){
        this.client = ClientBuilder.newClient();
    }
    
    
    /**
     *  POST de Cliente
     * @param c 
     */
    public void insertarCliente(Cliente c){
        
        try{
            
            WebTarget wt = this.client.target("http://localhost:8080/cliente");
            Invocation.Builder invocationBuilder = wt.request(MediaType.APPLICATION_JSON);
            
            Response response = invocationBuilder.post(Entity.entity(c.toString(),MediaType.APPLICATION_JSON));
            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));
            System.out.println();
        }
        catch(Exception e){
            e.printStackTrace();
         }
    }
    
    /**
     *  PUT de Cliente
     * @param c 
     */
    public void modificarCLiente(Cliente c){
        
        try{
            
            WebTarget wt = this.client.target("http://localhost:8080/cliente/" +c.getDni());
            Invocation.Builder invocationBuilder = wt.request(MediaType.APPLICATION_JSON);
            
            Response response = invocationBuilder.put(Entity.entity(c.toString(),MediaType.APPLICATION_JSON));
            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));
            System.out.println();
        }
        catch(Exception e){
            e.printStackTrace();
         }
    }
    
    /**
     * DELETE de Cliente
     * @param dni 
     */
    
    public void eliminarCLiente(String dni){
        
        try{
            
            WebTarget wt = this.client.target("http://localhost:8080/cliente/" + dni);
            Invocation.Builder invocationBuilder = wt.request(MediaType.APPLICATION_JSON);
            
            Response response = invocationBuilder.delete();
            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));
            System.out.println();
        }
        catch(Exception e){
            e.printStackTrace();
         }
    }
    
    /**
     * POST de Clase
     * @param clase 
     */
    
    public void insertarClase(Clase clase){
        
        try{
            
            WebTarget wt = this.client.target("http://localhost:8080/clase");
            Invocation.Builder invocationBuilder = wt.request(MediaType.APPLICATION_JSON);
            
            Response response = invocationBuilder.post(Entity.entity(clase.toString(),MediaType.APPLICATION_JSON));
            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));
            System.out.println();
        }
        catch(Exception e){
            e.printStackTrace();
         }
    }
    
    /**
     * PUT de Clase
     * @param clase 
     */
    
    public void modificarClase(Clase clase){
        
        try{
            
            WebTarget wt = this.client.target("http://localhost:8080/clase/" +clase.getId());
            Invocation.Builder invocationBuilder = wt.request(MediaType.APPLICATION_JSON);
            
            Response response = invocationBuilder.put(Entity.entity(clase.toString(),MediaType.APPLICATION_JSON));
            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));
            System.out.println();
        }
        catch(Exception e){
            e.printStackTrace();
         }
    }
    
    /**
     * DELETE de Clase
     * @param id 
     */
    
    public void eliminarClase(int id){
        
        try{
            
            WebTarget wt = this.client.target("http://localhost:8080/clase/" + id);
            Invocation.Builder invocationBuilder = wt.request(MediaType.APPLICATION_JSON);
            
            Response response = invocationBuilder.delete();
            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));
            System.out.println();
        }
        catch(Exception e){
            e.printStackTrace();
         }
    }
    
    /**
     * POST de Reserva
     * @param r 
     */
    
    public void insertarReserva(Reserva r){
        
        try{
            
            WebTarget wt = this.client.target("http://localhost:8080/reserva");
            Invocation.Builder invocationBuilder = wt.request(MediaType.APPLICATION_JSON);
            
            Response response = invocationBuilder.post(Entity.entity(r.toString(),MediaType.APPLICATION_JSON));
            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));
            System.out.println();
        }
        catch(Exception e){
            e.printStackTrace();
         }
    }
    
    /**
     * PUT de Reserva
     * @param reserva 
     */
    
     public void modificarReserva(Reserva reserva){

        try{
            
            WebTarget wt = this.client.target("http://localhost:8080/reserva/" +reserva.getId());
            Invocation.Builder invocationBuilder = wt.request(MediaType.APPLICATION_JSON);
            
            Response response = invocationBuilder.put(Entity.entity(reserva.toString(),MediaType.APPLICATION_JSON));
            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));
            System.out.println();
        }
        catch(Exception e){
            e.printStackTrace();
         }
    }
     
     /**
      * DELETE de Reserva
      * @param id 
      */
     
     public void eliminarReserva(int id){
        
        try{
            
            WebTarget wt = this.client.target("http://localhost:8080/reserva/" + id);
            Invocation.Builder invocationBuilder = wt.request(MediaType.APPLICATION_JSON);
            
            Response response = invocationBuilder.delete();
            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));
            System.out.println();
        }
        catch(Exception e){
            e.printStackTrace();
         }
    }
    
     
    
}
