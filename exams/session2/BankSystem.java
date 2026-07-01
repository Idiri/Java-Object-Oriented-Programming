package exams.session2;

import java.util.ArrayList;

public class BankSystem {
    private ArrayList<Konto> kontoer;

    public BankSystem() {
        this.kontoer = new ArrayList<>();
    }

    public void leggTilKonto(Konto k) {
        kontoer.add(k);
    }

    public ArrayList<Konto> finnRikeKunder(double grense) {
        ArrayList<Konto> rikeKunder = new ArrayList<>();
        for (Konto k : kontoer) {
            if (k.saldo > grense) {
                rikeKunder.add(k);
            }
        }
        return rikeKunder;
    }
}


