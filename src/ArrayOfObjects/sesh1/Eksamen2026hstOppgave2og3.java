package ArrayOfObjects.sesh1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Eksamen2026hstOppgave2og3 {
    public static void main(String[] args) {

    }
}
class Turnering{
    private final int antallLagTotalt;
    private final int antallLagPulje;
    private final List<Pulje> puljer;
    private final Random random = new Random();
    final List<Kamp> alleKamper;
    public Turnering(){
        this.antallLagTotalt = 36;
        this.antallLagPulje = 9;
        this.puljer = new ArrayList<>();
        this.alleKamper = new ArrayList<>();
        for(int i = 0; i < 4; i++){ puljer.add(new Pulje()); }
    }
    public void leggTilLagITurnering(int puljeIndeks, Lag lag){
        if(puljeIndeks < 0 || puljeIndeks > 3){
            throw new IllegalArgumentException(("puljeIndeks må være 0-3"))
        }else{
            puljer.get(puljeIndeks).leggTilLag(lag);
            lag.puljeNummer = puljeIndeks;
        }
    }
    public void leggTilLagFraPuljer(String[] puljeData, int puljeNr){
        for(String navn : puljeData){
            String land = navn.substring(navn.length() - 4, navn.length() - 1);
            leggTilLagITurnering(puljeNr, new Lag(nav, land));
        }
    }
    public void trekkAlleKamper(){
        int sum = 0;
        for(Pulje p : puljer){
            if(p.hentLag().size() != antallLagPulje){
                throw new IllegalStateException("Hver pulje må ha " + antallLagPulje + " lag.");
                sum += p.hentLag().size();
            }
            if(sum != antallLagTotalt){
                throw new IllegalStateException("Antall lag totalt stemmer ikke: " + sum);
                final int MAX_FORSOK = 20000;
                for(int forsok = 1; forsok <= MAX_FORSOK; forsok++){
                    alleKamper.clear();
                    for(Lag l : alleLag()){ l.kamper.clear(); }
                    if(genererAlleKamper()) return;
                }
                throw new IllegalStateException("Klarte ikke å generere gyldig trekning etter flere forsøk.");
            }
            private boolean genererAlleKamper(){
                for(int p = 0; p < 4; p++){
                    List<Lag> rekkefolge = new ArrayList<>(puljer.get(p).hentLag());
                    Collections.shuffle(rekkefolge, random);
                    for(Lag lag : rekkefolge){
                        for(int tilPulje = 0; tilPulje < 4; tilPulje++){
                            int har = antallMotstandereFraPulje(lag, tilPulje);
                            int trenger = 2 - har;
                            if(trenger <= 0) continue;
                            ArrayList<Lag> kandidater = new ArrayList<>(puljer.get(tilPulje).hentLag());
                            if(tilPulje == lag.puljeNummer) kandidater.remove(lag);

                            final int lagetsPulje = lag.puljeNummer;

                        }
                    }
                }
            }

        }
    }
    public void skrivUtKamperForPuljer(int puljeNr){

    }
}
class Pulje{
    private List<Lag> lagListe;
    public void leggTilLag(Lag lag){

    }
    public List<Lag> hentLag(){

    }
}
class Lag{
    private String navn;
    private String land;
    private int puljeNummer;
    private List<Kamp> kamper;

    public Lag(String navn, String land){
        this.navn = navn;
        this.land = land;
    }
}
class Kamp{
    private Lag hjemmelag;
    private Lag bortelag;

    public Kamp(Lag hjemmelag, Lag bortelag){
        this.hjemmelag = hjemmelag;
        this.bortelag = bortelag;
    }
}
