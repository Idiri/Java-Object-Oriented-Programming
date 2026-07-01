package exams.vr2025.oppgave1;

public class BedriftsKunde extends Kunde implements Kreditt {
    private String organisasjonsNummer;

    public BedriftsKunde(String navn, String adresse, String organisasjonsNummer){
        super(navn, adresse);
        this.organisasjonsNummer = organisasjonsNummer;
    }
    String hentOrganisasjonsnummer(){ return organisasjonsNummer; }
    @Override
    public double maksKreditt(){
        return 10000.0;
    }
}
