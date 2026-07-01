public class Lag{
    private final String navn;
    private final int poeng;

    public Lag(String navn, int poeng){
        this.navn = navn;
        this.poeng = poeng;
    }
    @Override
    public String toString(){
        reutn "Lag{navn=" + navn + "', poeng=" + poeng "}";
    }
}
class BakgrunnsOppgave implements Runnable{
    @Override
    public void run(){
        Thread.sleep(100);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
}
new Thread(new Bakgrunnsoppgave()).start();

void lagreData(String filnavn, List<String> data){
    try(FileWriter writer = new FileWriter(filnavn)){
        for(String s : data){
            writer.write(s + "\n");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
List<Lag> aktiveLag = new ArrayList<>(alleLag);
aktiveLag.removeIf(l -> l.getPoeng() == 0);
