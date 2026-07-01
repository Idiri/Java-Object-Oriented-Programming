package eksamensøving.sesh5;

import java.util.ArrayList;

public class EksamenV2025Oppgave1 {

}
class Person{
    private String navn;
    private String adresse;
    private String telefonnummer;

    Person(String navn, String adresse, String telefonnummer){
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
    }
}
class Ansatt extends Person{
    private String stilling;
    private boolean deltid;

    Ansatt(String navn, String adresse, String telefonnummer, String stilling){
        super(navn, adresse, telefonnummer);
        this.stilling = stilling;
    }
}
class Student extends Person{
    private String studentId;
    private ArrayList<Emne> emneListe;

    Student(){
        super("", "", "");
        this.studentId = "Ukjent";
        this.emneListe = new ArrayList<>();
    }
    Student(String navn, String adresse, String telefonnummer, String studentId){
        super(navn, adresse, telefonnummer);
        this.studentId = studentId;
        this.emneListe = new ArrayList<>();
    }
}
