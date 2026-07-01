package eksamensøving.sesh2;

public class BedriftsKunde extends Kunde implements Kreditt{
    private String organisasjonsnummer;

    public BedriftsKunde(String navn, String adresse, String organisasjonsnummer){
        super(navn, adresse);
        this.organisasjonsnummer = organisasjonsnummer;
    }
    public String hentOrganisasjonsnummer(){
        return organisasjonsnummer;
    }
    public double maksKreditt(){
        return 10000.0;
    }
}
