import java.util.*;
abstract class User{
    private String username;
    private String password;

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String newName){
        if(newName != null && !newName.isEmpty()){
            this.username = newName;
        }
    }
    

    User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public boolean login(String enteredPWD){
        return this.password.equals(enteredPWD);
    }
    public void logout() {
    System.out.println("User " + username + " has been securely logged out.");
    }
    abstract void displayPermissions();
    

}