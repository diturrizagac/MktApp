package mktApp.bussines;

/**
 *
 * @author DIEGO
 */

public class MainManager{
    /*Almacenamos datos */
    private static AdviserUserManager adviserUserManager;
    private static AccountUserManager accountUserManager;
    private static PotentialUserManager potentialUserManager;
    private static DatabaseManager databaseManager;
    
    /*Por medio de esta estructura de código podemos instanciar atributos estáticos*/
    static{
        adviserUserManager = new AdviserUserManager();
        accountUserManager = new AccountUserManager();
        potentialUserManager = new PotentialUserManager();
        databaseManager = new DatabaseManager();
    }
    
    public static AdviserUserManager getAdviserUserManager() {
        return adviserUserManager;
    }

    public static AccountUserManager getAccountUserManager() {
        return accountUserManager;
    }
    
    public static PotentialUserManager getPotentialUserManager(){
        return potentialUserManager;
    }
    public static DatabaseManager getDatabaseManager() {
        return databaseManager;
    }
    
}