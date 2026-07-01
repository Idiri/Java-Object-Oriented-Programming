package exams;

public class Ansatt extends Person{
    private String stilling;
    private boolean deltid;

    public Ansatt(String navn, String adresse, String telefonnummer, String stilling, boolean deltid){
        super(navn, "", "");
        this.stilling = stilling;
        this.deltid = deltid;
    }
}
