package exercises.oop.exceptions;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exception = An event that interrupts the normal flow of a program
        //             (Dividing by zero, file not found, mismatch input type)
        //             Surround any dangerous code with a try{} block
        //             try{}, catch{}, finally{}

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("That wasn't a number!");
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        } finally {
            System.out.println("this always runs");
        }



    }
}
