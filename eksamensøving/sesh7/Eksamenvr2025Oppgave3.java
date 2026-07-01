package eksamensøving.sesh7;

import java.util.Random;

public class Eksamenvr2025Oppgave3 {
}
class Timer implements Runnable{
    private long tidBrukt;
    @Override
    public void run(){
        long start = System.currentTimeMillis();

        int LIMIT = 10000000;
        Random random = new Random();
        double num1 = (double) LIMIT;
        double num2 = random.nextDouble();

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
class ThreadTest{
    public static void main(String[] args) {

        Timer t1 = new Timer();
        Timer t2 = new Timer();

        Thread tråd1 = new Thread(t1);
        Thread tråd2 = new Thread(t2);

        tråd1.start();
        tråd2.start();

        try{
            tråd1.join();
            tråd2.join();
        }catch(InterruptedException e){
            e.printStackTace();
        }
        long tid1 = t1.getTidBrukt();
        long tid2 = t2.getTidBrukt();
        System.out.println("Tid tråd 1: " + tid1 + "ms");
        System.out.println("Tid tråd 2: " + tid2 + "ms");
        System.out.println("Raskest tid: " + Math.min(tid1, tid2) + "ms");
    }
}
