public class Oppgave3 {
    public static void main(String[] args) {

        //Lager nytt Vinyl-objekt med alle nødvendige data (egenskaper):
        Vinyl plate = new Vinyl(
            "Bill Evans Trio",
            "Waltz for Bebby",
            "Bill Evans",
            "Scott LAfore",
            "Paul Motian",
            1961,
            "RLP 351"
        );

        System.out.println(plate.toString());
        //Dette blir det samme som koden over, prøve selv:
        //System.out.println(plate);

    }

}
class Vinyl{
    private String gruppe;
    private String tittel;
    private String piano;
    private String bass;
    private String drums;
    private int år;
    private String platenr;

    //Konstruktør for Vinyl objekt:
    public Vinyl(String g, String t, String p, String b, String d, int a, String pnr )
    {
        gruppe = g;
        tittel = t;
        piano = p;
        bass=b;
        drums=d;
        år=a;
        platenr=pnr;
    }

    public String getGruppe(){ return gruppe; }
    public String getTittel(){ return tittel; }
    public String getPiano(){ return piano; }
    public String getBass(){ return bass; }
    public String getDrums(){ return drums; }
    public int getÅr(){ return år; }
    public String getPlatenr(){ return platenr; }

    public String toString(){
        return "Gruppe: " + gruppe + "\n" +
               "Tittel: " + tittel + "\n" +
               "Piano: " + piano + "\n" +
               "Bass: " + bass + "\n" +
               "Drums: " + drums + "\n" +
               "År: " + år + "\n" +
               "Platenr: " + platenr;
    }

}
