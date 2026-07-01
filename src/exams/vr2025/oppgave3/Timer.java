package exams.vr2025.oppgave3;

import java.util.Random;

public class Timer extends Thread {
    private long tidBrukt;
    public void run(){
        int LIMIT = 10000000;
        Random random = new Random();
        double num1 = (double) LIMIT;
        double num2 = random.nextDouble();

        long start = System.currentTimeMillis();

        for(int index = 0; index < LIMIT; index++){
            num2 *= (double) index;
            num1 /= (int) num2;
        }
        long slutt = System.currentTimeMillis();

        this.tidBrukt = slutt - start;
    }
    public long getTidBrukt(){
        return tidBrukt;
    }







}





























/*private long tidBrukt;

@Override
public void run(){
    int LIMIT = 10000000;
    Random random = new Random();
    double num1 = (double) LIMIT;
    double num2 = random.nextDouble();

    long start = System.currentTimeMillis();

    for(int index = 0; index < LIMIT; index++){
        num2 *= (double) index;
        num1 /= (int) num2;
    }
    long slutt = System.currentTimeMillis();
    this.tidBrukt = slutt - start;
}
public long getTidBrukt(){
    return tidBrukt
}

 */