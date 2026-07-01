package eksamensøving.oppgave3;

import eksamensøving.sesh1.Emne;
import eksamensøving.sesh1.Institutt;
import eksamensøving.sesh1.Karakter;
import eksamensøving.sesh1.Student;

public class SokeFunksjoner {
    private Institutt institutt;
    private int funksjonsvalg;
    private String studentnavn;
    private String emnekode;
    private String bokstavKarakter;

    public SokeFunksjoner(Institutt institutt, int funksjonsvalg, String studentnavn, String emnekode, String bokstavKarakter){
        this.institutt = institutt;
        this.funksjonsvalg = -1;
        this.studentnavn = studentnavn;
        this.emnekode = emnekode;
        this.bokstavKarakter = bokstavKarakter;
    }
    public void finnStudent(String studentnavn){
        for(Student s : institutt.getStudentListe()){
            if(s.getNavn().equalsIgnoreCase(studentnavn)){
                System.out.println(s.toString());
            }
        }
    }
    public void finnAlleStudenterMedKarakter(String emnekode, String bokstavKarakter){
        for(Emne e : institutt.getEmneListe()){
            if(e.getEmnekode().equalsIgnoreCase(emnekode)){
                for(Karakter k : e.getKarakterer()){
                    if(k.getBokstavkarakter().equalsIgnoreCase(karakter)){
                        System.out.println(k.getStudent().getNavn());
                    }
                }
            }
        }
    }
    public void finnEmneKarakter(String studentnavn, String emnekode){
        for(Emne e : institutt.getEmneListe()){
            if(e.getEmnekode().equalsIgnorecase(emnekode)){
                for(Karakter k : e.getKarakterer()){
                    if(k.getStudent().getNavn().equalsIgnoreCase(studentnavn)){
                        System.out.println("Karakter: " + k.getBokstavkarakterer());
                        return;
                    }
                }
            }
    }
        System.out.println("Fant ingen karakter for denne studenten i dette emnet.");
}
