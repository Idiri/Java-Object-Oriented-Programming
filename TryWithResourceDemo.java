import java.util.Scanner;

public class TryWithResourceDemo {
    public static void main(String[] args) throws Exception {
      
      String string = null;
      
      try (Scanner input = new Scanner(System.in)) {
        System.out.println("Skriv et ord, og trykk enter");
        string = input.nextLine();
        System.out.println("Du valgte:"+string);
      }
      
        

      //tregner ikke bruke input.close()
 
      //Samme som:
      //alt:
      /*
      Scanner input = new Scanner(System.in);
      System.out.println("Skriv et ord, og trykk enter");
      string = input.nextLine();
      System.out.println("Du valgte:"+string);

      input.close();
        */
    } 
}
