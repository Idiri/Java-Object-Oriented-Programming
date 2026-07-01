package eksamensøving.exam2022.oppgave1;

public class Flight {
    private String destinasjon
    private String fly_nummer;
    private int kapasitet;
    private int antall_ledige_seter;

    public Flight(String destinasjon, String fly_nummer, int kapasitet, int antall_ledige_seter){
        this.destinasjon = destinasjon;
        this.fly_nummer = fly_nummer;
        this.kapasitet = kapasitet;
        this.antall_ledige_seter = antall_ledige_seter;
    }
    public int getAntall_ledige_seter(){
        return antall_ledige_seter;
    }
    public void setAntall_ledige_seter(int antall){
        this.antall_ledig_seter = antall;
    }
}
