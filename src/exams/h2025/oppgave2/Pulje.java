package exams.h2025.oppgave2;

import java.util.*;

public class Pulje {
   private List<Lag> lagListe;

   public void leggTilLag(Lag lag){
       lagListe.add(lag);
   }
   public List<Lag> hentLag() { return lagListe; }

}
