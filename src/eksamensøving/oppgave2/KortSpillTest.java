package eksamensøving.oppgave2;
import java.util.Scanner;
public class KortSpillTest {
    public static void main(String[] args) {
        Kortstokk stokk = new Kortstokk();
        stokk.blandKortene();

        Scanner sc = new Scanner(System.in);
        System.out.println("Spiller 2 har trukket: " + spillere[1].hentKort().hentType());
        System.out.println("Spiller 1 velger: Trykk 'h' for høy eller 'l' for lav");
        String valg = sc.nextLine();
        boolean gjetning = valg.equalsIgnoreCase("h");
        evaluerGjettingFor(spillere[0].hentNavn(), gjetning, spillere[0].hentKort(), spillere[1].hentKort());

        Spiller[] spillere = { new Spiller("Spiller 1"), new Spiller("Spiller 2")};
        spillEnRunde(stokk, spillere);
        bestemVinner(spillere);
    }
    public static void spillEnRunde(Kortstokk stokk, Spiller[] spillere){
        for(Spiller s : spillere){
            s.settKort(stokk.trekkKort());
        }
    }
    public static void bestemVinner(Spiller[] spillere){
        if(spillere[0].hentKort().hentRang() > spillere[1].hentKort().hentRang()){
            System.out.println(spillere[0].hentNavn() + " vant!");
        }
        else{
            System.out.println(spillere[1].hentNavn() + " vant!");
        }
    }
}
