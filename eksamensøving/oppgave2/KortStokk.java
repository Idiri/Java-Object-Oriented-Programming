package eksamensøving.oppgave2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class KortStokk {
    private ArrayList<Kort> kortene;

    public KortStokk(){
        this.kortene = new ArrayList<>();
        String[] typer = {"♡", "◊", "♣", "♠"};

        for(String type : typer){
            for(int rang = 1; rang <= 13; rang++){
                kortene.add(new Kort(type, rang));
            }
        }
    }
    public Kort trekkKort(){
        if(kortene.isEmpty()){
            return null;
        }
        return kortene.remove(0);
    }
    public Kort blandKortene(){
        Collections.shuffle(kortene);
    }
}
