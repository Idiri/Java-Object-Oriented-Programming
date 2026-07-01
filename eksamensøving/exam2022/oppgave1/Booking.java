package eksamensøving.exam2022.oppgave1;

public class Booking {
    private Flight flight;          // Én booking = ett fly
    private kunde kunde;            // Kobling til kunde-objektet
    private Dato dato_utreise;
    private Dato dato_hjemreise;

    public Booking(Flight flight, kunde kunde, Dato dato_utreise, Dato dato_hjemreise) {
        this.flight = flight;
        this.kunde = kunde;
        this.dato_utreise = dato_utreise;
        this.dato_hjemreise = dato_hjemreise;
    }

    // Getter for at Flyselskap skal kunne slette/håndtere bookingen
    public Flight getFlight() {
        return flight;
    }

}
class Dato {
    private int aar, mnd, dag;
    public Dato(int aar, int mnd, int dag) {
        this.aar = aar;
        this.mnd = mnd;
        this.dag = dag;
    }
}
