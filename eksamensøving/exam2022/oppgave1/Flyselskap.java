package eksamensøving.exam2022.oppgave1;


import java.util.ArrayList;

public class Flyselskap {
    private String firmanavn;
    private ArrayList<kunde> kunder;
    private ArrayList<Booking> bookinger;
    private ArrayList<Flight> flights;

    public Flyselskap(String firmanavn, int kunder){
        this.firmanavn = firmanavn;
        this.kunder = new ArrayList<>();
        this.bookinger = new ArrayList<>();
        this.flights = new ArrayList<>();
    }
    public void opprettBooking(kunde kunde, Flight flight, Dato ut, Dato hjem, int antallSeter){
        if(flight.getAntall_ledige_seter() >= antallSeter){
            Booking nyBooking = new Booking(flight, kunde, ut, hjem);
            this.bookinger.add(nyBooking);
            int nyeSeter = flight.getAntall_ledige_seter() - antallSeter;
            flight.setAntall_ledige_seter(nyeSeter);
        }
        else{
            System.out.println("Ingen ledige seter på valgt dato");
        }
    }
    public void slettBooking(){
        if(bookinger.contains(booking)){
            bookinger.remove(booking);

            Flight fly = booking.getFlight();
            fly.setAntall_ledige_seter(fly.getAntall_ledige_seter() + 1);
        }
    }
    public void opprettFlight(String destinasjon, String fly_nummer, int kapasitet, int antall_ledige_seter){
        Flight nyFlight = new Flight(destinasjon, fly_nummer, kapasitet, antall_ledige_seter);
        this.flights.add(nyFlight);
    }

    public void opprettKunde(String navn, String kunde_nummer){
        kunde nyKunde = new kunde(navn, kunde_nummer);
        this.kunder.add(nyKunde);
    }
}
