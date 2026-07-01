package eksamensøving.exam2022.oppgave1;

public class Main {
    public static void main(String[] args) {


        Flyselskap altoAirways = new Flyselskap("Alto Airways", 0);

        altoAirways.opprettKunde("Ola Nordmann", "101");
        altoAirways.opprettKunde("Kari Nordmann", "102");

        altoAirways.opprettFlight("Oslo", "SK123", 100, 100);
        altoAirways.opprettFlight("Bergen", "SK456", 100, 100);

        Dato ut = new Dato(2026, 7, 1);
        Dato hjem = new Dato(2026, 7, 8);
    }
}
