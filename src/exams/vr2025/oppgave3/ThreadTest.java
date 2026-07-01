package exams.vr2025.oppgave3;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException{

        Timer t1 = new Timer();
        Timer t2 = new Timer();
        Timer t3 = new Timer();

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Tid tråd 1: " + t1.getTidBrukt() + "ms");
        System.out.println("Tid tråd 2: " + t2.getTidBrukt() + "ms");
        System.out.println("Tid tråd 3: " + t3.getTidBrukt() + "ms");


        long raskest = Math.min(t1.getTidBrukt(), Math.min(t2.getTidBrukt(), t3.getTidBrukt()));
            System.out.println("Raskest tid: " + raskest);






    }
}



























/*
Timer t1 = new Timer();
Timer t2 = new Timer();
Timer t3 = new Timer();

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Tid tråd 1: " + t1.getTidBrukt() + "ms");
        System.out.println("Tid tråd 2: " + t2.getTidBrukt() + "ms");
        System.out.println("Tid tråd 3: " + t3.getTidBrukt() + "ms");

long raskeste = Math.min(t1.getTidBrukt(), Math.min(t2.getTidBrukt(), t3.getTidBrukt())){
        System.out.println("Raskeste tid: " + raskeste + "ms");
        }

 */