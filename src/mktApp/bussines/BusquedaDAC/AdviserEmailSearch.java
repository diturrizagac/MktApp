/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mktApp.bussines.BusquedaDAC;

import java.util.ArrayList;
import java.util.List;
import mktApp.entity.Adviser;
import mktApp.entity.ParametersEmailImpl;

/**
 *
 * @author DIEGO
 */
public class AdviserEmailSearch extends DivideAndConquerSearch<Adviser, ParametersEmailImpl> {

    @Override
    protected List<Adviser> solve(List<Adviser> list, ParametersEmailImpl parameters){
        Adviser adviser = null;
        for (int i=0; i<list.size(); i++){
            Adviser adviserAux = list.get(i);
            if(parameters.getEmail().trim().equalsIgnoreCase(adviserAux.getEmail())== true){
                adviser = adviserAux;
                i = list.size()+1;
            }
        }
        List<Adviser> result = new ArrayList<Adviser>();
        if(adviser != null){
            result.add(adviser);
        }
        return result;
    }


    
}
