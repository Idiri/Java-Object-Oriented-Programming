public class Admin extends User implements Authorized{

    public Admin(String username, String password){
        super(username, password);
    }
    
    @Override
    void displayPermissions() {
        System.out.println("Full System Access granted");
    }
    @Override
    public void accessSensitiveData() {
        System.out.println("Accessing database... Logs decrypted");
    }
    public void accessVault(int pin) throws SecurityBreachException{
        if(pin != 1234){
            throw new SecurityBreachException("CRITICAL: Unauthorized Vault Access Attempted!");
        }
        System.out.println("Vault Opened. Welcome, Admin");
    }
}