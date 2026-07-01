package eksamensøving.oppgave2;

public class Kort {
    private String type;
    private int rang;

    public Kort(String type, int rang){
        this.type = type;
        this.rang = rang;
    }
    public String hentType(){
        return type;
    }
    public int hentRang(){
        return rang;
    }
}
