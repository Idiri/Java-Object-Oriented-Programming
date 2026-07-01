package exams.session2;

public class Brukskonto extends Konto{
    private double gebyr;
    public Brukskonto(String kontoNummer, double saldo, double gebyr){
        super(kontoNummer, saldo);
        this.gebyr = gebyr;
    }
    @Override
    public void utførTransaksjon(double beløp){
        if(beløp < 0){
            this.saldo += (beløp-gebyr);
        }
        else{
            this.saldo += beløp;
        }
    }
}
