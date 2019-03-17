/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author HENRYELL
 */
public interface RMIINTERFACE extends Remote {
    
        public String hello(String text) throws RemoteException;
    
}
