package eksamensøving.sesh2;

public class PrivatKunde extends Kunde{
    private int personnummer;

    public PrivatKunde(String navn, String adresse, int personnummer){
        super(navn, adresse);
        this.personnummer = personnummer;
    }
    public int hentPersonnummer(){
        return personnummer;
    }
}
