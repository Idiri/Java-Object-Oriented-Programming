package exams.session2;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws InterruptedException{
        List<Konto> kontoer = new ArrayList<>();
        for(int i = 0; i < 1000; i++){
            kontoer.add(new Brukskonto("K-" + i, Math.random() * 10000, 0));

        }
        int antallProsessorer = Runtime.getRuntime().availableProcessors();
        SaldoKalkulator[] traader = new SaldoKalkulator[antallProsessorer];
        int batchStørrelse = 1000 / antallProsessorer;

        for(int i = 0; i < antallProsessorer; i++){
            int start = i * batchStørrelse;
            int slutt = (i == antallProsessorer - 1) ? 1000 : (i + 1) * batchStørrelse;

            traader[i] = new SaldoKalkulator(kontoer, start, slutt);
            traader[i].start();
        }
        double totalSaldo = 0;
        for(SaldoKalkulator t : traader){
            t.join();
            totalSaldo += t.getDelSum();
        }
        System.out.println("Total saldo: " + totalSaldo);
    }
}
