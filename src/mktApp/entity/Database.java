/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mktApp.entity;

import java.io.Serializable;
import java.util.ArrayList;
import mktApp.utility.UtilityFile;

/**
 *
 * @author DIEGO
 */
public class Database implements Serializable{
    
    private ArrayList<Potential> potentials;
    private ArrayList<Adviser> avdisers;
    private ArrayList<Account> accounts;
    
    public Database(){

        potentials = new ArrayList<Potential>();
        avdisers = new ArrayList<Adviser>();
        accounts = new ArrayList<Account>();
    }
    
    public boolean guardarCambios(){
        return UtilityFile.guardarArchivo("E:\\db.txt", this);
    }

    public ArrayList<Potential> getPotentials() {
        return potentials;
    }

    public ArrayList<Adviser> getAdvisers() {
        return avdisers;
    }
    
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    
}
