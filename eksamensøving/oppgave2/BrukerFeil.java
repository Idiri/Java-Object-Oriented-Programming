package eksamensøving.oppgave2;

public class BrukerFeil extends Exception{
    private String valg;
    public BrukerFeil(String melding) {
        super(melding);
        this.valg = valg;
    }


}
//if (!valg.equals("h") && !valg.equals("l")){
//        throw new BrukerFeil("Du har tastet feil, bruk 'h' eller 'l' neste gang...");
//}


