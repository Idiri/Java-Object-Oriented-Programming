package eksamensøving.sesh5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EksamenH2025Oppgave2og3 {
    static String[] pulje1 = {
            "Paris (FRA)",
            "Real Madrid (ESP)",
            "Man City (ENG)",
            "Bayern Munchen (GER)",
            "Liverpool (ENG)",
            "Inter (ITA)",
            "Chelsea (ENG)",
            "Borussia Dortmund (GER)",
            "Barcelona (ESP)"
    };
    static String[] pulje2 = {
            "Arsenal (ENG)",
            "Leverkusen (GER)",
            "Athletic Madrid (ESP)",
            "Benfica (POR)",
            "Atalanta (ITA)",
            "Juventus (ITA)",
            "Villarreal (ESP)",
            "Frankfurt (GER)",
            "Club Brugge (BEL)"
    };
    static String[] pulje3 = {
            "Tottenham (ENG)",
            "PSV Eindhoven (NED)",
            "Ajax (NED)",
            "Napoli (ITA)",
            "Sporting CP (POR)",
            "Olympiacos (GRE)",
            "Slavia Praha (CZE)",
            "Bodø/Glimt (NOR)",
            "Marseille (FRA)"
    };
    static String[] pulje4 = {
            "Copenhagen (DEN)",
            "Monaco (FRA)",
            "Galatasaray (TUR)",
            "Union SG (BEL)",
            "Qarabag (AZE)",
            "Athletic Club (ESP)",
            "Newcastle (ENG)",
            "Pafos (CYP)",
            "Kairat Almaty (KAZ)"
    };
    public static void main(String[] args){

    }
}
class Turnering{
    private int antalLagTotalt;
    private int antallLagIPulje;
    private List<Pulje> puljer;
    private Random random;
    private List<Kamp> alleKamper;

    public Turnering(){
        this.antallLagTotalt = 36;
        this.antallLagIPulje = 9;
        this.puljer = new ArrayList<>();
        this.random = new Random();
        this.alleKamper = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            puljer.add(new Pulje());
        }
    }
    public void leggTilLagITurnering(int puljeIndeks, Lag lag){
        if(puljeIndeks < 0 || puljeIndeks > 3){
            throw new IllegalArgumentException("Pulje Indeks må være mellom 0-3")
        }
        puljer.get(puljeIndeks).leggTilLag(lag);
        lag.setPuljeNummer(puljeIndeks);
    }
    public void leggTilLagFraPuljer(String[] Data, int puljeNr){
        for(String navnMedLand : puljeData){
            int start = navnMedLand.lastIndexOf('(') + 1;
            int slutt = navnMedLand.lastIndexOf(')');
            String land = navnMedLand.substring(start, slutt);

            Lag nyttLag = new Lag(navnMedLand, land);
            leggTilLagITurnering(puljeNr, nyttLag);
        }
    }
    public void trekkAlleKamper(){

    }
    public void skrivUtKamperForPulje(int puljeNr){
        Pulje p = puljer.get(puljeNr - 1);

        for(Lag lag : p.hentLag()){
            System.out.println(lag + " spiller følgende kamper:");
            int i = 0;
            for(Kamp k : lag.getKamper()){
                Lag motstander = (k.getHjemmelag() == lag) ? k.getBortelag() : k.getHjemmelag();

                if(i % 2 == 0){
                    System.out.println(" " + lag + " - " + motstander);
                }else{
                    System.out.println(" " + motstander + " - " + lag);
                }
                i++;
            }
            System.out.println();
        }
    }
    private boolean genererAlleKamper(){

    }
    private boolean verifiserResultat(){
        if(alleKamper.size() != 144) return false;
        for(Lag l : alleLag()){
            if(l.getKamper().size() != 8) return false;
        }
        return true;
    }
}
class Pulje{
    private List<Lag> lagListe;

    public void leggTilLag(Lag lag){
        lagListe.add(lag);
    }
    public List<Lag> hentLag(){

    }
}
class Lag{
    private String navn;
    private String land;
    private int puljeNummer;
    private List<Kamp> kamper;

    Lag(String navn, String land){
        this.navn = navn;
        this.land = land;
        this.kamper = new ArrayList<>();
    }
    public String toString(){

    }
    public void setPuljeNummer(int nr){
        this.puljeNummer = nr;
    }
    public void getKamper(){
        return 0;
    }
}
class Kamp{
    private Lag hjemmelag;
    private Lag bortelag;

    Kamp(Lag hjemmelag, Lag bortelag){
        this.hjemmelag = hjemmelag;
        this.bortelag = bortelag;
    }
    public String toString(){

    }
}
