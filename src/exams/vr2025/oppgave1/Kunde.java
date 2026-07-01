package exams.vr2025.oppgave1;

public abstract class Kunde {
    private String navn;
    private String adresse;

    public Kunde(String navn, String adresse){
        this.navn = navn;
        this.adresse = adresse;
    }
    public String hentNavn(){ return navn; }
    public String hentAdresse(){ return adresse; }
}
