package eksamensøving.sesh7;

import java.util.ArrayList;
public class Eksamenvr2025Oppgave1 {
}
class Firma{
    private String firmaNavn;
    private int antallKunderPrivat;
    private int antallKunderBedrift;
    private ArrayList<PrivatKunde> privatKunder;
    private ArrayList<BedriftsKunde> bedriftsKunder;

    Firma(String firmaNavn, int antallKunderPrivat, int antallKunderBedrift){
        this.firmaNavn = firmaNavn;
        this.antallKunderPrivat = antallKunderPrivat;
        this.antallKunderBedrift = antallKunderBedrift;
        this.privatKunder = new ArrayList<>();
        this.bedriftsKunder = new ArrayList<>();
    }
    public String hentFirmaNavn(){

    }
}
class Kunde{
    private String navn;
    private String adresse;

}
abstract class BedriftsKunde extends Kunde implements Kreditt{
    private String organisasjonsnummer;

    BedriftsKunde(String navn, String adresse, String organisasjonsnummer){
        super(navn, adresse);
        this.organisasjonsnummer = organisasjonsnummer;
    }
    String hentNavn(){
        return navn;
    }
    String hentAdresse(){
        return adresse;
    }
    public double maksKreditt(){
        return 10000.0;
    }
}
class PrivatKunde extends Kunde{
    private int personnummer;
    PrivatKunde(String navn, String adresse, int personnummer){
        super(navn, adresse);
        this.personnummer = personnummer;
    }
    public int hentPersonnummer(){
        return personnummer;
    }
}
interface Kreditt{
    double maksKreditt();
}