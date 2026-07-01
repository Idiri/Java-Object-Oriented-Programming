import java.util.*;
public class except{
    public static void main(String[] args){
        

        try (Scanner scanner = new Scanner(System.in)){

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(number);
        }
        catch(InputMismatchException e){
            System.out.println("That wasn't a number!");
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by zero!");
        }
        catch(Exception e){
            // Safety Net
            System.out.println("Something went wrong!");
        }
        finally{
            System.out.println("This always executes");
        }

    }
}