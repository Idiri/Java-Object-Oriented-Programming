package eksamensøving.sesh5;

public class EksamenH2025Oppgave1 {
    public static void main(String[] args) {
        System.out.println("Oppgave 1: Kompilerin test..");
    }
}
abstract class Person{
    private String navn;
    private String kontaktInfo;
    private int alder;

    public Person(String navn, String kontaktInfo, int alder){
        this.navn = navn;
        this.kontaktInfo = kontaktInfo;
        this.alder = alder;
    }
}
class Spiller extends Person{
    private Lag lag;
    private int dyktighet;

    public Spiller(String navn, int alder, String kontaktInfo, Lag lag){
        super(navn, kontaktInfo, alder);
        this.dyktighet = 50;
        this.lag = lag;
    }
    void egenTrening(){
        if(dyktighet < 100){
            dyktighet += 1;
        }
    }
    void forfall(){
        if(dyktighet > 0){
            dyktighet -= 1;
        }
    }
}
class Trener extends Person{
    Lag lag;
    Trener(String navn, String kontakt, int alder, Lag lag){
        super(navn, kontakt, alder);
        this.lag = lag;
    }
}
class HovedTrener extends Trener implements Leder{
    private String[] strategi;

    HovedTrener(String navn, String kontakt, int alder, Lag lag){
        super(navn, kontakt, alder, lag);
        strategi = new String[10];
        this.lag = lag;
    }
    public String giLagStrategi(int valg){
        return strategi[valg];
    }
}
interface Leder{
    String giLagStrategi(int valg);
}
class Lag{
    private String navn;
    private String land;
    private int piljeNummer;
    Lag(String navn, String land){
        this.navn = navn;
        this.land = land;
    }
}