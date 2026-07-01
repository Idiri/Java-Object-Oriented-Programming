package exams;

public class Person {
    private String navn;
    private String adresse;
    private String telefonnummer;
    Person(String navn, String adresse, String telefonnummer){
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
    }
    @Override
    public String toString(){
        return navn + ", " + adresse + ", " + telefonnummer;
    }
}
