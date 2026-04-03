import java.util.ArrayList;
public class SecurityMain{
    public static void main(String[] args){
    ArrayList<User> userList = new ArrayList<>();
    userList.add(new Admin("Alice", "Secure123"));
    userList.add(new Guest("Bob", "Guest123"));

    for(User u : userList){
        u.displayPermissions();

        if(u instanceof Admin){
            Admin a = (Admin) u;
            try{
                System.out.println("Attempting to open Alice's vault...");
                a.accessVault(9999);
            }
            catch(SecurityBreachException e){
                System.err.println("SECURITY EVENT: " + e.getMessage());
            }
        }

        if(u instanceof Authorized){
            ((Authorized) u).accessSensitiveData();
        }else{
            System.out.println("Access Denied for: " + u.getUsername());
        }
        System.out.println("----------------------");
    }
}
}