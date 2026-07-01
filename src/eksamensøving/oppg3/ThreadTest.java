package eksamensøving.oppg3;

public class ThreadTest {
    public static void main(String[] args) {
        Timer t1 = new Timer();
        Timer t2 = new Timer();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Tid tråd 1: " + t1.getTidBrukt() + "ms");
        System.out.println("Tid tråd 2: " + t2.getTidBrukt() + "ms");

        long raskeste = Math.min(t1.getTidBrukt(), t2.getTidBrukt());
        System.out.println("Raskeste tid: " + raskeste + "ms");
    }
}
