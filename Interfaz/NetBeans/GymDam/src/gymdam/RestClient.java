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
            
            Response response = invocationBuilder.post(Entity.entity(c.toString(),MediaType.APPLICATION_JSON));
            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));
            System.out.println();
        }
        catch(Exception e){
            e.printStackTrace();
         }
    }
}
