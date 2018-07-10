/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mktApp.bussines.BusquedaDAC;

import java.util.ArrayList;
import java.util.List;
import mktApp.entity.Account;
import mktApp.entity.ParametersLoginImpl;

/**
 *
 * @author DIEGO
 */
public class AccountLoginSearch extends DivideAndConquerSearch<Account, ParametersLoginImpl> {
    
    @Override
    protected List<Account> solve(List<Account> list, ParametersLoginImpl parameters){
        Account account = null;
        for (int i=0; i<list.size(); i++){
            Account accountAux = list.get(i);
            if(parameters.getUsername().trim().equals(accountAux.getEmail()) == true &&
                parameters.getPassword().trim().equals(accountAux.getPassword()) == true){
                account = accountAux;
                i = list.size()+1;
            }
        }
        List<Account> result = new ArrayList<Account>();
        if(account != null){
            result.add(account);
        }
        return result;
    }
}
