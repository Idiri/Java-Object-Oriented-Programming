package exams.vr2025.oppgave1;

public class PrivatKunde extends Kunde {
    private int personNummer;

    public PrivatKunde(String navn, String adresse, int personNummer){
        super(navn, adresse);
        this.personNummer = personNummer;
    }
    int hentPersonnummer(){ return personNummer; }
}
