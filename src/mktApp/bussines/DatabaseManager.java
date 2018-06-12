package mktApp.bussines;

/**
 *
 * @author Diego Iturrizaga
 */

public class DatabaseManager extends Manager{
    
    /**
     * Guarda los cambios realizados en el sistema en la base de datos.
     */
    public boolean guardarCambios(){
        return dataBase.guardarCambios();
    }
    
}