package exams;

public class Emne {
    private String emnekode;
    private String emnenavn;
    private String foreleser;
    private Student[] studenter;
    private Karakter[] karakterer;

    public Emne(String emnekode, String emnenavn, Ansatt foreleser){
        this.emnekode = emnekode;
        this.emnenavn = emnenavn;
        this.foreleser = foreleser.toString();
        this.studenter = new Student[10];
        this.karakterer = new Karakter[10];
    }
}
