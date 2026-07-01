package exams.session1;

import java.util.ArrayList;

public class Zookeeper {
    ArrayList<Dyr> list = new ArrayList<>();

    void leggTilDyr(Dyr d) {
        list.add(d);
    }
    void finnEldreEnn(int alder){
        for(Dyr d : list){
            if(d.getAlder() > alder){
                System.out.println(d.getNavn() + " er " + d.getAlder() + " år gammel.");
            }
        }
    }
}
