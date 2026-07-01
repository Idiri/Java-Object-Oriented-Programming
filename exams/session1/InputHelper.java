package exams.session1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHelper {
    public static int lesHeltall(){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while(true){
            try{
                System.out.println("Skriv inn et heltall: ");
                return sc.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Du har tastet feil, velg et gyldig tall.");
                sc.next();
            }
        }

    }
}
