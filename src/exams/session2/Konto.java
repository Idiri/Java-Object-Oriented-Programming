package exams.session2;

public abstract class Konto {
    String kontoNummer;
    double saldo;
    public Konto(String kontoNummer, double saldo){
        this.kontoNummer = kontoNummer;
        this.saldo = saldo;
    }
    public abstract void utførTransaksjon(double beløp);
    public double getSaldo(){
        return saldo;
    }
}
