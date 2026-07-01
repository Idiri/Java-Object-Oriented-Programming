package exams;

public class Student extends Person{
    private String studentid;
    private Emne[] emneListe;

    public Student(){
        super("", "", "");
        this.emneListe = new Emne[10];
    }
    public Student(String navn, String adr, String tlf, String studentid){
        super(navn, adr, tlf);
        this.studentid = studentid;
        this.emneListe = new Emne[10];
    }

}
