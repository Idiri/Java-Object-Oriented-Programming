package eksamensøving.sesh1;

import java.util.ArrayList;

public class Emne {
    private String emnekode;
    private String emnenavn;
    private Ansatt foreleser;
    private ArrayList<Student> studenter;
    private ArrayList<Karakter> karakterer;

    public Emne(String emnekode, String emnenavn, Ansatt foreleser){
        this.emnekode = emnekode;
        this.emnenavn = emnenavn;
        this.foreleser = foreleser;
        this.studenter = new ArrayList<>();
        this.karakterer = new ArrayList<>();
    }

    public String getEmnekode(){
        return emnekode;
    }
    public String getEmnenavn(){
        return emnenavn;
    }
}
