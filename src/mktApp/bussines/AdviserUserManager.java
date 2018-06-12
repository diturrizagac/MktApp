/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mktApp.bussines;

import mktApp.bussines.BusquedaDAC.AdviserSearch;
import java.util.ArrayList;
import java.util.List;
import mktApp.entity.Adviser;
import mktApp.entity.ParametersLoginImpl;
import mktApp.entity.Potential;

/**
 *
 * @author DIEGO
 */
public class AdviserUserManager extends Manager{
    //IniciarSesion
    public boolean signInAdviser(Adviser adviser) { //iniciar sesion
        boolean state = false;
        
        List<Adviser> lsAdvisers = dataBase.getAdvisers();
        
        ParametersLoginImpl parameters = new ParametersLoginImpl();
        parameters.setUsername(adviser.getEmail());
        parameters.setPassword(adviser.getPassword());
        
        List<Adviser> result;
        
        AdviserSearch DYV = new AdviserSearch();
        result = DYV.search(lsAdvisers, parameters);
        if(result.size() != 0){
            
        }
        return state;
    }
    
    //Tamanio de Arreglo
    public int getSize(){
        ArrayList<Adviser> lsAdvisers = dataBase.getAdvisers();
        return lsAdvisers.size();
    }
    
    //Registro Asesor
    public boolean signUpAdviser(Adviser adviser){ //registrarse
        boolean status = false;
        
        Adviser adviserAux = validateAdviser(adviser.getEmail());
        if(adviserAux == null){
            dataBase.getAdvisers().add(adviser);
            status = true;
        }
        return status;
    }
    
    //Buscar Asesor
    public Adviser searchAdviser(String username){
        ParametersLoginImpl parameters = new ParametersLoginImpl();
        parameters.setUsername(username);
        
        List<Adviser> lsAdvisers = dataBase.getAdvisers();
        List<Adviser> advisersAux;
        
        AdviserSearch DYV = new AdviserSearch();
        advisersAux = DYV.search(lsAdvisers, parameters);
        return advisersAux.get(0);
    }
    
    //Validar Asesor
    public Adviser validateAdviser(String username){
        Adviser adviser = null;
        
        ArrayList<Adviser> lsAdvisers = dataBase.getAdvisers();
        Adviser adviserAux = null;
        
        for(int i=0; i<lsAdvisers.size(); i++){
            adviserAux = lsAdvisers.get(i);
            
            if(username.trim().equalsIgnoreCase(adviserAux.getEmail()) == true){
                adviser = adviserAux;
                i = lsAdvisers.size()+1;
            }       
        }
        return adviser;
    }
    
    
}
