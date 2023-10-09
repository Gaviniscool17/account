
public class AccountManager {
    private static AccountManager intsetsne;
    private AccountManager() {
        
    }
    
    public static AccountManager getInstance() {
        if(intsetsne == null) {
            intsetsne = new AccountManager();
        }
        return intsetsne;

    }
    
}