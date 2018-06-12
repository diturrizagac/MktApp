/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mktApp.bussines.BusquedaDAC;

import mktApp.entity.User;
import mktApp.entity.Parameters;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author DIEGO
 */
public abstract class DivideAndConquerSearch<T extends User, P extends Parameters> {
    private static int CRITERIO_TAMANIO_MINIMO_ARRAY = 6;
    
//    private <T extends Usuario>  List<List<T>> dividir(final List<T> lista) {
    private List<List<T>> divide(final List<T> list) {    
        // T se le llama Genérico        
        List<List<T>> subLists = new ArrayList<List<T>>();
        
        int medio = list.size()%2==0? //condicion, si el tamanio del vector es par, entonces
                list.size()/2: //verdadero
                (list.size()-1)/2; // falso

        subLists.add(list.subList(0, medio));       
        subLists.add(list.subList(medio+1,list.size()-1));
        return subLists;
    }
    
    protected abstract List<T> solve(final List<T> lista, P parameters);
    

    /**
     *
     * El mezclado ya se hace en el metodo calcular.
     *
     * @param list
     * @return lista total de indices
     */
    private List<T> mixUp(final List<T> list){
        return list;
    }

    
  
    public List<T> search(final List<T> list, P parameters) {

        if( list.size() < CRITERIO_TAMANIO_MINIMO_ARRAY ) {
            return solve(list,parameters);
        }else { 
            List<T> result =  new ArrayList<T>();
           
            List<List<T>> subLists = divide(list);
            for (List<T> subList : subLists) {
                List<T> user = search(subList,parameters);
                // el mezclado ya se hace aqui
                result.addAll(user);
            }
            return mixUp(result);
        }
    }
}
