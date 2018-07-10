/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mktApp.bussines;

import java.util.ArrayList;
import java.util.List;
import mktApp.bussines.BusquedaDAC.AccountEmailSearch;
import mktApp.bussines.BusquedaDAC.AccountLoginSearch;
import static mktApp.bussines.Manager.dataBase;
import mktApp.entity.Account;
import mktApp.entity.ParametersEmailImpl;
import mktApp.entity.ParametersLoginImpl;

/**
 *
 * @author DIEGO
 */
public class Account_AccountUserManager extends Manager{
    //IniciarSesion
    public boolean signInAccount(Account account) { //iniciar sesion
        boolean state = false;
        
        List<Account> accounts = dataBase.getAccounts();
        
        ParametersLoginImpl parameters = new ParametersLoginImpl();
        parameters.setUsername(account.getEmail());
        parameters.setPassword(account.getPassword());
        
        List<Account> result;
        
        AccountLoginSearch DYV = new AccountLoginSearch();
        result = DYV.search(accounts, parameters);
        if(result.size() != 0){
            
        }
        return state;
    }
    
    //Tamanio de Arreglo
    public int getSize(){
        ArrayList<Account> accounts = dataBase.getAccounts();
        return accounts.size();
    }
    
    //Registro Cuenta
    public boolean signUpAccount(Account account){ //registrarse
        boolean status = false;
        
        Account accountAux = validateAccount(account.getEmail());
        if(accountAux == null){
            dataBase.getAccounts().add(account);
            status = true;
        }
        return status;
    }
    
    //Validar Cuenta
    public Account validateAccount(String username){
        Account account = null;
        
        ArrayList<Account> lsAccounts = dataBase.getAccounts();
        Account accountAux = null;
        
        for(int i=0; i<lsAccounts.size(); i++){
            accountAux = lsAccounts.get(i);
            
            if(username.trim().equalsIgnoreCase(accountAux.getEmail()) == true){
                account = accountAux;
                i = lsAccounts.size()+1;
            }       
        }
        return account;
    }
    //Actualizacion de Cuenta
    public boolean updateAccount(Account account){
        boolean status =false;
        ArrayList<Account> accounts = dataBase.getAccounts();
        Account accountAux = null;
        
        for(int i=0; i<accounts.size(); i++){
            accountAux = accounts.get(i);
            if(account.getEmail_adviser().trim().equalsIgnoreCase(accountAux.getEmail_adviser()) == true){
                accounts.remove(i);
                accounts.add(i,account);
                status = true;
                i = accounts.size()+1; //rompe el bucle
            }       
        }
        return status;
    }
    
    //Buscar Cuenta
    public Account searchAccount(String account_email){
        ParametersEmailImpl parameters = new ParametersEmailImpl();
        parameters.setEmail(account_email);
        
        List<Account> lsAccounts = dataBase.getAccounts();
        List<Account> accountsAux;
        
        AccountEmailSearch DYV = new AccountEmailSearch();
        accountsAux = DYV.search(lsAccounts, parameters);
        return accountsAux.get(0);
    }
    
    
    
    //Mostrar lista de cuentas de un asesor
    public ArrayList<Account> searchAccounts(String adviser_email){
        ArrayList<Account> lsAccounts = dataBase.getAccounts();
        ArrayList<Account> result = new ArrayList<>();
        Account accountAux = null;
        
        for(int i=0; i<lsAccounts.size(); i++){
            accountAux = lsAccounts.get(i);
            if(adviser_email.trim().equalsIgnoreCase(accountAux.getEmail_adviser()) == true){
                result.add(accountAux);
            }
        }
        return result;
    }
}
