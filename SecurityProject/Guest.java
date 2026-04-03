class Guest extends User{
    Guest(String username, String password){
        super(username, password);
    }

    @Override
    void displayPermissions() {
        System.out.println("Read only access");
    }
}