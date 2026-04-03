public class Overload{
    public static void main(String[] args){
        
        User user1 = new User("Spongebob");
        User user2 = new User("Patrick", "PStar@aol.com");
        User user3 = new User("Sandy", "Sandy@mail.com")
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

    }
}