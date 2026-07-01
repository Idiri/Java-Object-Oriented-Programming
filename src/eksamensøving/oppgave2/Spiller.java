package eksamensøving.oppgave2;

public class Spiller {
    private String navn;
    private int poeng;
    private Kort kort;

    public Spiller(String navn){
        this.navn = navn;
    }
    public String hentNavn(){
        return navn;
    }
    public int hentPoeng(){
        return poeng;
    }
    public Kort hentKort(){
        return kort;
    }
    public void leggTilPoeng(){

    }
    public void settKort(){

    }

}
