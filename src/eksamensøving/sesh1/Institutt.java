package eksamensøving.sesh1;


import java.util.ArrayList;

public class Institutt {
    private String navn;
    private String adresse;
    private ArrayList<Ansatt> ansattListe;
    private ArrayList<Emne> emneListe;
    private ArrayList<Student> studentListe;

    public Institutt(String navn, String adresse){
        this.navn = navn;
        this.adresse = adresse;
        this.ansattListe = new ArrayList<>();
        this.emneListe = new ArrayList<>();
        this.studentListe = new ArrayList<>();
    }
    public boolean leggTilEmne(String emnekode, String emnenavn, String ansattnavn){
        Ansatt foreleser = null;
        for(Ansatt a : ansattListe){
            if(a.getNavn().equals(ansattnavn)){
                foreleser = a;
                break;
            }
        }
        if(foreleser != null){
            Emne nyttEmne = new Emne(emnekode, emnenavn, foreleser);
            emneListe.add(nyttEmne);
            return true;
        }
        return false;
    }
    public void skrivUtAlleEmner(String emnekode, String emnenavn){
        for(Emne e : emneListe){
            System.out.println("Kode: " + e.getEmnekode() + ", Navn: " + e.getEmnenavn());
        }
    }
    public boolean registrerEmneForStudent(String emnekode, String studentnavn){
        Student funnetStudent = null;
        Emne funnetEmne = null;

        for(Student s : studentListe){
            if(s.getNavn().equals(studentnavn)){
                funnetStudent = s;
                break;
            }
        }
        for(Emne e : emneListe){
            if(e.getEmnekode().equals(emnekode)){
                funnetEmne = e;
                break;
            }
        }
        if(funnetStudent != null && funnetEmne != null){
            funnetStudent.getEmneListe().add(funnetEmne);
            funnetEmne.getStudenter().add(funnetStudent);
            return true;
        }
        return false;
    }
}
