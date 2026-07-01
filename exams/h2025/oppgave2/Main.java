package exams.h2025.oppgave2;

public class Main {
    public static void main(String[] args) {
        Turnering turnering = new Turnering();

        turnering.leggTilLagiTurnering(0, new Lag("Paris", "FRA"));
        turnering.leggTilLagiTurnering(1, new Lag("Arsenal", "ENG"));
        turnering.leggTilLagiTurnering(2, new Lag("Bodø/Glimt", "NOR"));
        turnering.leggTilLagiTurnering(3, new Lag("Copenhagen", "DEN"));

        turnering.trekkAlleKamper();

        turnering.skrivUtKamperForPulje(2);
    }
}
