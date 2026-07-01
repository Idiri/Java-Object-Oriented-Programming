package eksamensøving;

public class Main {
    public static void main(String[] args) {
        List<Kamp> kamper = new ArrayList<>();
        kamper.add(new Kamp(new Lag("Paris", "FRA"), new Lag("Arsenal", "ENG")));

        FilSkriverTraad traad = new FilSkriverTraad(kamper, "resultat.txt");
        traad.start();
    }
}
