package exams;

public class Karakter {
    private Student student;
    private Emne emne;
    private String bokstavKarakter;

    public Karakter(Student student, Emne emne, String bokstavKarakter){
        this.student = student;
        this.emne = emne;
        this.bokstavKarakter = bokstavKarakter;
    }
}
