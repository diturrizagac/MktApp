/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mktApp.bussines.BusquedaDAC;


import java.util.ArrayList;
import java.util.List;
import mktApp.entity.ParametersEmailImpl;
import mktApp.entity.Potential;

/**
 *
 * @author DIEGO
 */
public class PotentialSearch extends DivideAndConquerSearch<Potential, ParametersEmailImpl>{
    @Override
    protected List<Potential> solve(List<Potential> list, ParametersEmailImpl parameters){
        Potential potential = null;
        
        for(int i=0; i<list.size();i++){
            Potential potentialAux = list.get(i);
            
            if(parameters.getEmail().trim().equals(potentialAux.getEmail())== true){
                potential = potentialAux;
                i = list.size()+1;
            }
        }
        List<Potential> result = new ArrayList<Potential>();
        if(potential != null){
            result.add(potential);
        }
        return result;
    }
    
}
