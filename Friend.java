public class Friend{

    private static int numOfFriends;
    private String name;

    public Friend(String name){
        this.name = name;
        numOfFriends++;
    }
    public static void showFriends(){
        System.out.println("You have " + numOfFriends + " friends");
    }

    public String getName(){ return name; }








}