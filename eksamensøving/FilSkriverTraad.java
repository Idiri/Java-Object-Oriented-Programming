package eksamensøving;

import java.util.List;

public class FilSkriverTraad extends Thread{
    private List<Kamp> kamper;
    private String filnavn;

    public FilSkriverTraad(List<Kamp> kamper, String filnavn){
        this.kamper = kamper;
        this.filnavn = filnavn;
    }
    @Override
    public void run(){
        try(FileWriter writer = new FileWriter(filnavn)){
            for(Kamp k : kamper){
                writer.write(k.toString() + "\n");
            }
            }catch(IOException e){
            System.out.println("feil ved skriving til fil: " + e.getMessage());
        }
    }
}
