package exams.h2025.oppgave2;

import java.util.List;

public class Lag {
   private String navn;
   private String land;
   private int puljeNummer;
   private List<Kamp> kamper;
   public Lag(String navn, String land){
       this.navn = navn;
       this.land = land;
   }

   public void leggTilKamp(Kamp k){ kamper.add(k); }
   public String getNavn(){ return navn; }
   public String getLand(){ return land; }
   public List<Kamp> getKamper() { return kamper; }
   public void setPuljeNummer(int p){ this.puljeNummer = p; }
}
