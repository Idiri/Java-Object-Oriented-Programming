package exams;

public class Institutt {
    private String navn;
    private String adresse;
    private Ansatt[] ansattListe;
    private Emne[] emneListe;
    private Student[] studentListe;

    public Institutt(String navn, String adresse){
        this.navn = navn;
        this.adresse = adresse;
        this.ansattListe = new Ansatt[100];
        this.emneListe = new Emne[100];
        this.studentListe = new Student[100];
    }
    private int emneTeller = 0;
    public boolean leggTilEmne(String emnekode, String emnenavn, String ansattnavn){
        if(emneTeller < emneListe.length){
            Ansatt ansatt = new Ansatt(ansattnavn, "Foreleser", "", "", false);
            Emne nyttEmne = new Emne(emnekode, emnenavn, ansatt);
            emneListe[emneTeller] = nyttEmne;
            emneTeller++;
            return true;
        }
        return false;
    }
    public void skrivUtAlleEmner(){

    }
    public void registrerEmneForStudent(String emnekode, String studentnavn){

    }
}
