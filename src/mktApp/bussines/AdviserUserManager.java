/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mktApp.bussines;

import mktApp.bussines.BusquedaDAC.AdviserLoginSearch;
import java.util.ArrayList;
import java.util.List;
import mktApp.bussines.BusquedaDAC.AdviserEmailSearch;
import mktApp.entity.Adviser;
import mktApp.entity.ParametersLoginImpl;
import mktApp.entity.ParametersEmailImpl;

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
        
        AdviserLoginSearch DYV = new AdviserLoginSearch();
        result = DYV.search(lsAdvisers, parameters);
        if(result.size() != 0){
            state = true;
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
    //Buscar Asesor
    public Adviser searchAdviser(String adviser_email){
        ParametersEmailImpl parameters = new ParametersEmailImpl();
        parameters.setEmail(adviser_email);
        
        List<Adviser> lsAdvisers = dataBase.getAdvisers();
        List<Adviser> advisersAux;
        
        AdviserEmailSearch DYV = new AdviserEmailSearch();
        advisersAux = DYV.search(lsAdvisers, parameters);
        return advisersAux.get(0);
    }
    
    
    
    
    
}
