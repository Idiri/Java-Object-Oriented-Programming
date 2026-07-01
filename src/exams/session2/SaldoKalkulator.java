package exams.session2;

import java.util.ArrayList;
import java.util.List;

public class SaldoKalkulator extends Thread{
    private List<Konto> kontoer;
    private int start;
    private int slutt;
    private double delSum = 0;

    public SaldoKalkulator(List<Konto> kontoer, int start, int slutt){
        this.kontoer = kontoer;
        this.start = start;
        this.slutt = slutt;
    }
    @Override
    public void run(){
        for(int i = start; i < slutt; i++){
            delSum += kontoer.get(i).getSaldo();
        }
    }
    public double getDelSum(){
        return delSum;
    }
}
