/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mktApp.bussines;

import java.util.ArrayList;
import java.util.List;;
import mktApp.bussines.BusquedaDAC.PotentialSearch;
import mktApp.entity.ParametersLoginImpl;
import mktApp.entity.Potential;

/**
 *
 * @author DIEGO
 */
public class PotentialUserManager extends Manager{
    
    //IniciarSesion
    public boolean singInPotential(Potential potential) { //iniciar sesion
        boolean state = false;
        
        List<Potential> potentials = dataBase.getPotentials();
        
        ParametersLoginImpl parameters = new ParametersLoginImpl();
        parameters.setUsername(potential.getEmail());
        parameters.setPassword(potential.getPassword());
        
        List<Potential> result;
        
        PotentialSearch DYV = new PotentialSearch();
        result = DYV.search(potentials, parameters);
        if(result.size() != 0){
            
        }
        return state;
    }
    
    public int getSize(){
        ArrayList<Potential> potentials = dataBase.getPotentials();
        return potentials.size();
    }
    
    //Registro Potencial Cliente
    public boolean signUpPotential(Potential adviser){ //registrarse
        boolean status = false;
        
        Potential adviserAux = validatePotential(adviser.getEmail());
        if(adviserAux == null){
            dataBase.getPotentials().add(adviser);
            status = true;
        }
        return status;
    }
    
    //Buscar Potencial Cliente 
    public Potential searchPotential(String nameAdviser){
        ParametersLoginImpl parameters = new ParametersLoginImpl();
        parameters.setUsername(nameAdviser);
        
        List<Potential> lsPotentials = dataBase.getPotentials();
        List<Potential> potentialAux;
        
        PotentialSearch DYV = new PotentialSearch();
        potentialAux = DYV.search(lsPotentials, parameters);
        return potentialAux.get(0);
    }    
    
    //Validar Potencial Cliente
    public Potential validatePotential(String username){
        Potential potential = null;
        
        ArrayList<Potential> Potential = dataBase.getPotentials();
        Potential potentialAux = null;
        
        for(int i=0; i<Potential.size(); i++){
            potentialAux = Potential.get(i);
            
            if(username.trim().equalsIgnoreCase(potentialAux.getEmail()) == true){
                potential = potentialAux;
                i = Potential.size()+1;
            }       
        }
        return potential;
    }
    
    //Traer los potenciales clientes
    
    public ArrayList<Potential> searchPotentials(String adviser_email){
        ArrayList<Potential> lsPotentials = dataBase.getPotentials();
        ArrayList<Potential> result = new ArrayList<>();
        Potential potentialAux = null;
        
        for(int i=0; i<lsPotentials.size(); i++){
            potentialAux = lsPotentials.get(i);
            if(adviser_email.trim().equalsIgnoreCase(potentialAux.getEmail_adviser()) == true){
                result.add(potentialAux);
            }
        }
        return result;
    }
}
