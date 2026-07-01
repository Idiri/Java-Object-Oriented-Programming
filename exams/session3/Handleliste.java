package exams.session3;
import java.util.ArrayList;

public class Handleliste {

    private ArrayList<String> varer;
    public Handleliste(){
        this.varer = new ArrayList<>();
    }
    public void leggTil(String vare){
        varer.add(vare);
    }
    public void skrivUtAlt(){
        System.out.println("Her er listen din: ");
        for(String v : varer){
            System.out.println(v);
        }
    }

}
