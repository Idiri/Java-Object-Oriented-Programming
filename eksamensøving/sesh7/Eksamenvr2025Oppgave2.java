package eksamensøving.sesh7;

import java.util.ArrayList;
import java.util.Collections;

public class Eksamenvr2025Oppgave2 {
}
class KortSpillTest{
    public static void main(String[] args) {
        KortStokk kortstokk = new KortStokk();
        Spiller[] spillere = {new Spiller("Spiller 1"), new Spiller("Spiller 2")};
        stokk.blandKortene();
        spillEnRunde(stokk, spillere);
        bestemVinner(spillere);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Spiller2 har trukket " + spillere[1].hentKort().hentType() + " " + spillere[1].hentKort().hentRang());
        System.out.println("Spiller1 velger: Trykk 'h' for høy eller 'l' for lav");

        try{
            String input = scanner.nextLine();
            if(!input.equals("h") && !input.equals("l")){
                throw new BrukerFeil("Du har tastet feil, bruk 'h' eller 'l' neste gnag");
            }
            boolean gjetning = input.equals("h");
            evaluerGjettingFor(spiller[0].hentNavn(), gjetning, spillere[0].hentKort(), spillere[1].hentKort());
        }catch(BrukerFeil e){
            System.out.println((e.getMessage()));
            System.exit(1);
        }
    }
    private evaluerGjettingFor(String spillerNavn, boolean gjetning, Kort spillerKort, Kort motstanderKort){
        boolean erHøyere = spillerKort.hentRang() < motstanderKort.hentRang();

        System.out.println(spillerNavn + " trakk: " + spillerKort.hentRang());
        System.out.println("Motstanderen trakk: " + motstanderKort.hentRang());

        if (gjetning == erHøyere) {
            System.out.println("Gratulerer! " + spillerNavn + " vant runden.");
        } else {
            System.out.println("Beklager, " + spillerNavn + " tapte runden.");
        }
    }
    private static void spillEnRunde(){

    }
    private bestemVinner(){
        for(Spiller s : spillere){
            s.settKort(kortstokk.trekkKort());
        }
    }
    public static String bestemVinner(){
        if(spillere[0].hentKort().hentRang() > spillere[1].hentKort().hentRang()){
            System.out.println(spillere[0].hentNavn() + " vant!");
        }else if(spillere[1].hentKort().hentRang() > spillere[1].hentKort().hentRang()){
            System.out.println(spillere[0].hentNavn() + " vant!");
        }else{
            System.out.println("Uavgjort!");
        }
    }
}
class Spiller{
    private String navn;
    private int poeng;
    private Kort kort;

    Spiller(String navn){
        this.navn = navn;
    }
    public String hentNavn(){
        return navn;
    }
    public int hentPoeng(){
        return poeng;
    }
    public Kort hentKort(){
        return kort;
    }
    public void leggTilPoeng(){

    }
    public void settKort(){

    }
}
class KortStokk{
    private ArrayList<Kort> kortene;
    KortStokk(){
        this.kortene = new ArrayList<>();
        String[] typer = {"♡", "♢", "♣", "♠"};
        for(String type : typer){
            for(int i = 1; i <= 13; i++){
                kortene.add(new Kort(type, i));
            }
        }
    }
    public Kort trekkKort(){
        if(!kortene.isEmpty()){
            return kortene.remove(0);
        }
        return null;
    }
    public boolean blandKortene(){
        Collections.shuffle(kortene);
    }
}
class Kort{
    private String type;
    private int rang;

    Kort(String type, int rang){
        this.type = type;
        this.rang = rang;
    }
    public String hentType(){
        return type;
    }
    public int hentRang(){
        return rang;
    }
}
class BrukerFeil extends Exception{
    public BrukerFeil(String valg){
        super(valg);
    }
}