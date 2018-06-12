package mktApp.bussines;

import mktApp.entity.Database;
import java.io.Serializable;
import mktApp.utility.UtilityFile;


/**
 *
 * @author DIEGO
 */

public abstract class Manager{

    protected static Database dataBase;
    
    /*Por medio de esta estructura de código podemos instanciar atributos estáticos*/
    static{
        /*Verificamos si podemos cargar datos desde el archivo*/
        Serializable fileReaded = UtilityFile.leerArchivo("C:\\Agencia2\\agencia.txt");
        if(fileReaded != null && fileReaded instanceof Database){
            dataBase = (Database) fileReaded;
        }else{
            dataBase = new Database();
            
                /*Insertamos en la base de datos un usuario de pruebas*/
            /*Empresa miEmpresa = new Empresa();
            miEmpresa.setRuc("1047212510");
            miEmpresa.setRazonSocial("F&F");
            miEmpresa.setPassword("kora");
            dataBase.getEmpresas().add(miEmpresa);*/
            
            /*Persona mipersona=new Persona();
            mipersona.setDni("47212510");
            mipersona.setNombre(" jose perez huaman");
            mipersona.setPassword("kora");
            dataBase.getPersonas().add(mipersona);*/
        
        }
        
    }
    
}