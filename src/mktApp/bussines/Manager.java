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
        Serializable fileReaded = UtilityFile.leerArchivo("E:\\db.txt");
        if(fileReaded != null && fileReaded instanceof Database){
            dataBase = (Database) fileReaded;
        }else{
            dataBase = new Database();
        }
        
    }
    
}