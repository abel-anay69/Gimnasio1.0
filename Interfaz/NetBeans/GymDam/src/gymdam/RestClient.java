/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymdam;

import org.glassfish.jersey.*;
import org.glassfish.jersey.client.*;

import javax.ws.rs.client.*;


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
}
