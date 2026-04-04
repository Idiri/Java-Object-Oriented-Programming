public class Kolonne{


    private int[] kolonne;
    private int N;

    public Kolonne(int kol, int[][] brett){
        this.N = brett.length;
        this.kolonne = new int[N];
        for(int i = 0; i < N; i++){
            this.kolonne[i] = brett[i][kol];
        }

    }
    public int getVerdi(int rad){
        return kolonne[rad];
    }
    public void setVerdi(int rad, int verdi){
        kolonne[rad] = verdi; 
    }


}