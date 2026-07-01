package eksamensøving.sesh7;

import java.util.ArrayList;

public class Eksamenvr2022Oppgave1 {
    public static void main(String[] args) {
        Flyselskap altoAirways = new Flyselskap("Alto Airways");

        Kunde privatKunde = new Kunde("Noah", 123456789);
        Kunde bedriftsKunde = new Kunde("Bedrift AS", 987654321);
        altoAirways.opprettKunde(privatKunde.hentNavn(), privatKunde.hentKundeNummer());
        altoAirways.opprettKunde(bedriftsKunde.hentNavn(), bedriftsKunde.hentKundeNummer());

        Dato datoUtreise = new Dato(2026, 10, 3);
        Dato datoHjemreise = new Dato(2026, 10, 3);

        altoAirways.opprettFlight("Oslo", datoUtreise, 100);
        altoAirways.opprettFlight("Oslo", datoHjemreise, 100);

        altoAirways.OpprettBooking("Oslo", privatKunde, 2, datoUtreise, datoHjemreise);
        altoAirways.OpprettBooking("Oslo", bedriftsKunde, 5, datoUtreise, datoHjemreise);

    }
}
class Flyselskap{
    private final String Firmanavn;
    private final ArrayList<Kunde> kunder;
    private final ArrayList<Booking> bookinger;
    private final ArrayList<Flight> flights;
    Flyselskap(String Firmanavn, String kunder){
        this.Firmanavn = Firmanavn;
        this.kunder = new ArrayList<>();
        this.bookinger = new ArrayList<>();
        this.flights = new ArrayList<>();
    }
    public void slettBooking(Booking booking){
        Booking nyBooking = new Booking();
        if(bookinger.remove(booking)){
            bookinger.getUtreise().frigjorSeter(bookinger.getAntallSeter());
            bookinger.getHjemreise().frigjorSeter(bookinger.getAntallSeter());
            System.out.println("Bookinger slettet for: " + booking.getKunde().hentNavn());
        }else{
            System.out.println("Booking ikke funnet.");
        }
    }
    public void opprettFlight(String destinasjon, Dato dato, int antall_ledige_seter){
        Flight nyFlight = new Flight("Madrid", 101, 69, 60);
        flights.add(nyFlight);
    }
    public void opprettKunde(String navn, int kunde_nummer){
        Kunde nyKunde = new Kunde(navn, kunde_nummer);
        kunder.add(nyKunde);
    }
    public void OpprettBooking(String destinasjon, String kunde, int antallSeter, String dato_utreise, String dato_hjemreise, String antall_ledige_seter){
        Flight utreiseFlight = finnLedigFlight(destinasjon, dato_utreise, dato_hjemreise);
        Flight hjemreiseFlight = finnLedigFlight(destinasjon, dato_utreise, dato_hjemreise);
        if(utreiseFlight != null || hjemreiseFlight != null){
            utreiseFlight.reserverSeter(antallSeter);
            hjemreiseFlight.reserverSeter(antallSeter);
            Booking nyBooking = new Booking("Alto Airways", kunde, dato_utreise, dato_hjemreise);
            bookinger.add(nyBooking);
        }
        else{
            System.out.println("Ingen ledige seter på nevnt dato");
        }
    }
}
class Booking{
    private String flight;
    private String kunde;
    private String dato_utreise;
    private String dato_hjemreise;

    public Booking(String flight, String kunde, String dato_utreise, String dato_hjemreise){
        this.flight = flight;
        this.kunde = kunde;
        this.dato_utreise = dato_utreise;
        this.dato_hjemreise = dato_hjemreise;
    }


}
class Kunde{
    private String navn;
    private int kunde_nummer;

    public Kunde(String navn, int kunde_nummer){
        this.navn = navn;
        this.kunde_nummer = kunde_nummer;
    }
}
class Bedriftskunde extends Kunde{
    private int kredittgrense;
    public Bedriftskunde(String navn, int kunde_nummer, int kredittgrense){
        super(navn, kunde_nummer);
        this.kredittgrense = kredittgrense;
    }
}
class Flight{
    private String destinasjon;
    private int fly_nummer;
    private int kapasitet;
    private int antall_ledige_seter;
    public Flight(String destinasjon, int fly_nummer, int kapasitet, int antall_ledige_seter){
        this.destinasjon = destinasjon;
        this.fly_nummer = fly_nummer;
        this.kapasitet = kapasitet;
        this.antall_ledige_seter = antall_ledige_seter;
    }
}
class Dato(){
    private int aar;
    private int mnd;
    private int dag;
    public Dato(int aar, int mnd, int dag){
        this.aar = aar;
        this.mnd = mnd;
        this.dag = dag;
    }
}