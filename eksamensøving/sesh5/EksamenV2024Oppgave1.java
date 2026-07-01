package eksamensøving.sesh5;

import java.util.ArrayList;

public class EksamenV2024Oppgave1 {

}
class Ansatt extends Person{
    private String stilling;
    private boolean deltid;

    Ansatt(String navn){

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
class Emne{
    private String emnekode;
    private String emnenavn;
    private Ansatt foreleser;
    private ArrayList<Student> studenter;
    private ArrayList<Karakter> karakterer;

    Emne(String emnekode, String emnenavn, Ansatt foreleser){
        this.emnekode = emnekode;
        this.emnenavn = emnenavn;
        this.foreleser = foreleser;
        this.studenter = new ArrayList<>();
        this.karakterer = new ArrayList<>();
    }
}
class Karakter{
    private Student student;
    private Emne emne;
    private String bokstavKarakter;

    Karakter(Student student, Emne emne, String bokstavKarakter){
        this.student = student;
        this.emne = emne;
        this.bokstavKarakter = bokstavKarakter;
    }
}
class Institutt{
    private String navn;
    private String adresse;
    private ArrayList<Ansatt> ansattListe;
    private ArrayList<Emne> emneListe;
    private ArrayList<Student> studentListe;

    Institutt(String navn, String adresse){
        this.navn = navn;
        this.adresse = adresse;
        this.ansattListe = new ArrayList<>();
        this.emneListe = new ArrayList<>();
        this.studentListe = new ArrayList<>();
    }
    public boolean leggTilEmne(String emnekode, String emnenavn, String ansattnavn){
        for(Ansatt a : ansattListe){
            if(a.getNavn().equals(ansattnavn)){
                foreleser = a;
                break;
            }

        }
        if(foreleser != null){
            Emne nyttEmne = nytt Emne(emnekode, emnenavn, foreleser);
            emneListe.add(nyttEmne);
        }
    }
    public void skrivUtAlleEmner(){

    }
    public void registrerEmneForStudent(String emnekode, String studentnavn){

    }
}