package exams.h2025.oppgave2;

public class Kamp {
   private Lag hjemmelag;
   private Lag bortelag;

   public Kamp(Lag hjemmelag, Lag bortelag){
       this.hjemmelag = hjemmelag;
       this.bortelag = bortelag;
   }


   public String toString() {
       return hjemmelag.getNavn() + " - " + bortelag.getNavn();
   }
}
