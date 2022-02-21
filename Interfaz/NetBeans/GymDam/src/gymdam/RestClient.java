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
 * @author dam_aap
 */
public class RestClient {
    
    Client client;
    
    public RestClient(){
        this.client = ClientBuilder.newClient();
    }
    
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
    
     /*public Cliente(int id){
         
         Cliente c = new Cliente();
         try{
             
            WebTarget wt = this.client.target("http://localhost:8080/cliente/" + id);
            Invocation.Builder invocationBuilder = wt.request(MediaType.APPLICATION_JSON);
            
            Response response = invocationBuilder.get();
            
         }
         catch(Exception e){
            e.printStackTrace();
         }
    }*/
    
}
