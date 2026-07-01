package exams.session1;

public class Main {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Løve løve = new Løve("Simba", 5, 10);
        Tiger tiger = new Tiger("Paul", 10);

        zookeeper.leggTilDyr(løve);
        zookeeper.leggTilDyr(tiger);

        for(Dyr d : zookeeper.list){
            System.out.println("Navn: " + d.getNavn() + ", Lyd: " + d.lagLyd());
        }
        zookeeper.finnEldreEnn(7);

    }
}
