/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mktApp.bussines.BusquedaDAC;


import java.util.ArrayList;
import java.util.List;
import mktApp.entity.Adviser;
import mktApp.entity.ParametersLoginImpl;


/**
 *
 * @author DIEGO
 */
public class AdviserSearch extends DivideAndConquerSearch<Adviser, ParametersLoginImpl>{
    
    @Override
    protected List<Adviser> solve(List<Adviser> lista, ParametersLoginImpl parameters) {
        Adviser adviser = null;
        
        for(int i = 0; i < lista.size(); i++){
            //Obtenemos el usuario "i"
            Adviser adviserAux = lista.get(i);
            
            //Verificamos la condición
            if(parameters.getUsername().trim().equals(adviserAux.getEmail()) == true &&
                parameters.getPassword().trim().equals(adviserAux.getPassword()) == true){
                adviser = adviserAux;
                i = lista.size()+1;
            }
        }
        /* Validamos si se encontro algun resultado */
        List<Adviser> result = new ArrayList<Adviser>();
        if(adviser != null){
            result.add(adviser);
        }
        return result;
    }
}