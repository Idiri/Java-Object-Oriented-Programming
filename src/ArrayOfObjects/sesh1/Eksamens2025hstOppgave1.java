package ArrayOfObjects.sesh1;

public class Eksamens2025hstOppgave1 {
    public static void main(String[] args) {

    }
}
abstract class Person{
    private String navn;
    private String kontaktInfo;
    private int alder;

    Person(String navn, String kontaktInfo, int alder){
        this.navn = navn;
        this.kontaktInfo = kontaktInfo;
        this.alder = alder;
    }
}
class Spiller extends Person{
    private Lag lag;
    private int dyktighet;
    Spiller(String navn, String kontaktinfo, int alder, Lag lag){
        super(navn, kontaktinfo, alder);
        this.lag = lag;
        this.dyktighet = 50;
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
    private Lag lag;
    public Trener(String navn, String kontaktInfo, int alder, Lag lag){
        super(navn, kontaktInfo, alder);
        this.lag = lag;
    }
}
class HovedTrener extends Trener implements Leder{
    private String[] strategi;
    public HovedTrener(String navn, String kontaktInfo, int alder, Lag lag){
        super(navn, kontaktInfo, alder, lag);
        this.strategi = new String[10];
        this.lag = lag;
    }
    public String giLagStrategi(int valg){
        return strategi[valg];
    }
}
class Lag{
    private String navn;
    private String land;
    private int puljeNummer;
    public Lag(String navn, String land){
        this.navn = navn;
        this.land = land;
    }
}
interface Leder{
    public String giLagStrategi(int valg);
}