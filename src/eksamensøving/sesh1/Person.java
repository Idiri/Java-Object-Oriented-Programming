package eksamensøving.sesh1;

public class Person {
    private String navn;
    private String adresse;
    private String telefonnummer;

    public Person(String navn, String adresse, String telefonnummer){
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
    }
    public String getNavn(){
        return navn;
    }
    public String toString(){
        return "Navn: " + navn + ", ADresse: " + adresse + ", Tlf: " + telefonnummer;
    }
}
