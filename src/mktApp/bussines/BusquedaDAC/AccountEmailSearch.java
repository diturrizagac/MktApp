/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mktApp.bussines.BusquedaDAC;

import java.util.ArrayList;
import java.util.List;
import mktApp.entity.Account;
import mktApp.entity.ParametersEmailImpl;

/**
 *
 * @author DIEGO
 */
public class AccountEmailSearch extends DivideAndConquerSearch<Account, ParametersEmailImpl>{
    
    @Override
    protected List<Account> solve(List<Account> lista, ParametersEmailImpl parameters) {
        Account account = null;
        
        for(int i = 0; i < lista.size(); i++){
            //Obtenemos el usuario "i"
            Account accountAux = lista.get(i);
            
            //Verificamos la condición
            if(parameters.getEmail().trim().equals(accountAux.getEmail()) == true){
                account = accountAux;
                i = lista.size()+1;
            }
        }
        /* Validamos si se encontro algun resultado */
        List<Account> result = new ArrayList<Account>();
        if(account != null){
            result.add(account);
        }
        return result;
    }
}
