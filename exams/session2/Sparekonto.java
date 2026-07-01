package exams.session2;

public class Sparekonto extends Konto{
    private double renteFaktor;
    public Sparekonto(String kontoNummer, double saldo, double renteFaktor){
        super(kontoNummer, saldo);
        this.renteFaktor = renteFaktor;
    }
    @Override
    public void utførTransaksjon(double beløp){
        if(beløp > 0){
            this.saldo += (beløp * (1+renteFaktor));
        }
        else{
            this.saldo += beløp;
        }
    }
}
