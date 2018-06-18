/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mktApp.bussines;

import java.util.ArrayList;
import java.util.List;
import mktApp.bussines.BusquedaDAC.AccountSearch;
import static mktApp.bussines.Manager.dataBase;
import mktApp.entity.Account;
import mktApp.entity.ParametersLoginImpl;

/**
 *
 * @author DIEGO
 */
public class AccountUserManager extends Manager{
    //IniciarSesion
    public boolean signInAccount(Account account) { //iniciar sesion
        boolean state = false;
        
        List<Account> accounts = dataBase.getAccounts();
        
        ParametersLoginImpl parameters = new ParametersLoginImpl();
        parameters.setUsername(account.getEmail());
        parameters.setPassword(account.getPassword());
        
        List<Account> result;
        
        AccountSearch DYV = new AccountSearch();
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
    
    //Registro Asesor
    public boolean signUpAccount(Account account){ //registrarse
        boolean status = false;
        
        Account accountAux = validateAccount(account.getEmail());
        if(accountAux == null){
            dataBase.getAccounts().add(account);
            status = true;
        }
        return status;
    }
    
    //Buscar Asesor
    public Account searchAdviser(String username){
        ParametersLoginImpl parameters = new ParametersLoginImpl();
        parameters.setUsername(username);
        
        List<Account> lsAccounts = dataBase.getAccounts();
        List<Account> accountsAux;
        
        AccountSearch DYV = new AccountSearch();
        accountsAux = DYV.search(lsAccounts, parameters);
        return accountsAux.get(0);
    }
    
    //Validar Asesor
    public Account validateAccount(String username){
        Account account = null;
        
        ArrayList<Account> Accounts = dataBase.getAccounts();
        Account accountsAux = null;
        
        for(int i=0; i<Accounts.size(); i++){
            accountsAux = Accounts.get(i);
            
            if(username.trim().equalsIgnoreCase(accountsAux.getEmail()) == true){
                account = accountsAux;
                i = Accounts.size()+1;
            }       
        }
        return account;
    }
    
    //Mostrar lista de cuentas de un asesor
    public ArrayList<Account> searchAccounts(String adviser_name){
        ArrayList<Account> lsAccounts = dataBase.getAccounts();
        ArrayList<Account> result = new ArrayList<>();
        Account accountAux = null;
        
        for(int i=0; i<lsAccounts.size(); i++){
            accountAux = lsAccounts.get(i);
            if(adviser_name.trim().equalsIgnoreCase(accountAux.getEmail()) == true){
                result.add(accountAux);
            }
        }
        return result;
    }
}
