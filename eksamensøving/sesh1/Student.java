package eksamensøving.sesh1;

import java.util.ArrayList;

public class Student extends Person{
    private String studentid;
    private ArrayList<Emne> emneListe;

    public Student(String studentid){
        super("", "", "");
        this.studentid = studentid;
        this.emneListe = new ArrayList<>();
    }
    public Student(String navn, String adresse, String telefonnummer, String studentid){
        super(navn, adresse, telefonnummer);
        this.studentid = studentid;
        this.emneListe = new ArrayList<>();
    }
}
