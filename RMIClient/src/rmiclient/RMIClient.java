/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiclient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*import needed classes here*/
 /*
 * @author HENRYELL
 */
public class RMIClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     try{
         String methodName   = "hello";
         String host        = args[0];
         int port           = 1208;
         System.out.println(host = "+host");
         
         Registry reg = LocateRegistry.getRegistry(host, port);
         RMIInterface rmi = (RMIInterface)reg.lookup(methodName);
         System.out.println("Connected to server");
         
         
         String msg = rmi.hello("Henry");
         System.out.println(msg);
     } catch (Exception e){
         System.out.println(e);
     }
    }

     }
// TODO code application logic here
    
    

