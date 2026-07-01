package eksamensøving.exam2022.oppgave1;

public class Bedriftskunde extends kunde{
    private int kredittgrense;

    public Bedriftskunde(String navn, String kunde_nummer, int kredittgrense){
        super(navn, kunde_nummer);
        this.kredittgrense = kredittgrense;
    }
}
