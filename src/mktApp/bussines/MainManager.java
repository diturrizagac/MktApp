package mktApp.bussines;

/**
 *
 * @author DIEGO
 */

public class MainManager{
    /*Almacenamos datos */
    private static DatabaseManager databaseManager;
    private static AdviserUserManager adviserUserManager;
    private static AccountUserManager accountUserManager;
    private static PotentialUserManager potentialUserManager;
    //Para los clientes
    private static Account_AdviserUserManager acc_adviserUserManager;
    private static Account_AccountUserManager acc_accountUserManager;
    private static Account_PotentialUserManager acc_potentialUserManager;
    
    /*Por medio de esta estructura de código podemos instanciar atributos estáticos*/
    static{
        databaseManager = new DatabaseManager();
        adviserUserManager = new AdviserUserManager();
        accountUserManager = new AccountUserManager();
        potentialUserManager = new PotentialUserManager();
        acc_adviserUserManager = new Account_AdviserUserManager();
        acc_accountUserManager = new Account_AccountUserManager();
        acc_potentialUserManager = new Account_PotentialUserManager();
    }
    
    public static DatabaseManager getDatabaseManager() {
        return databaseManager;
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
    
    public static Account_AdviserUserManager getAccount_AdviserUserManager() {
        return acc_adviserUserManager;
    }

    public static Account_AccountUserManager getAccount_AccountUserManager() {
        return acc_accountUserManager;
    }
    
    public static Account_PotentialUserManager getAccount_PotentialUserManager(){
        return acc_potentialUserManager;
    }
    
}