package exams.h2025.oppgave2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Turnering {
    private int antallLagTotalt;
    private int antallLagPulje;
    private List<Pulje> puljer;
    private Random random;
    private List<Kamp> alleKamper;

    public Turnering(){
        this.antallLagTotalt = 36;
        this.antallLagPulje = 9;
        this.random = new Random();
        this.puljer = new ArrayList<>();
        for(int i = 0; i < 4; i++) puljer.add(new Pulje());
    }

    public void leggTilLagiTurnering(int puljeIndeks, Lag lag){
        if(puljeIndeks >= 0 && puljeIndeks <= 3){
            puljer.get(puljeIndeks).leggTilLag(lag);
            lag.setPuljeNummer(puljeIndeks);
        }
    }
    public void leggTilLagFraPuljer(String[] puljeData, int puljeNr){
        for(String data : puljeData){
            int start = data.indexOf("(") + 1;
            int slutt = data.indexOf(")");
            String land = data.substring(start, slutt);
            String navn = data.substring(0, start - 2);

            Lag nyttLag = new Lag(navn, land);
            leggTilLagiTurnering(puljeNr, nyttLag);
        }
    }

    public void skrivUtKamperForPulje(int puljeNr){
        Pulje p = puljer.get(puljeNr);
        for(Lag l : p.hentLag()){
            System.out.println(l.getNavn() + " (" + l.getLand() + ") spiller følgende kamper:");
            List<Kamp> kamper = l.getKamper();
            for(int i = 0; i < kamper.size(); i++){
                System.out.println(kamper.get(i).toString());
            }
        }
    }

    public List<Kamp> getAlleKamper() { return alleKamper; }

    public void trekkAlleKamper(){
        System.out.println("Trekning utføres...");
    }

}
