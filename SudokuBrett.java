public class SudokuBrett{


    private int[][] brett;
    private Rad[] rader;
    private Kolonne[] kolonner;
    private int N;


    public SudokuBrett(int[][] brett){
        N = brett.length;
        this.brett = brett;
        this.rader = new Rad[N];
        this.kolonner = new Kolonne[N];
        for(int i = 0; i < N; i++){
            rader[i] = new Rad(brett[i]);
        }
        for(int i = 0; i < N; i++){
            kolonner[i] = new Kolonne(i, brett);
        }
    }
/**
 * Løser Sudoku-brettet ved hjelp av backtracking.
 * @return true hvis brettet er løst, false hvis ingen løsning finnes
 */
    public boolean finnRiktigVerdi(){
        for(int rad = 0; rad < N; rad++){
            for(int kol = 0; kol < N; kol++){
                if(brett[rad][kol] == 0){
                    for(int num = 1; num <= N; num++){
                        if(erRiktig(rad, kol, num)){
                            brett[rad][kol] = num;
                            rader[rad].setVerdi(kol, num);
                            kolonner[kol].setVerdi(rad, num);
                            if(finnRiktigVerdi()){
                                return true;
                            }
                            brett[rad][kol] = 0;
                            rader[rad].setVerdi(kol, 0);
                            kolonner[kol].setVerdi(rad, 0);
                        }
                    }
                    return false;
                }
            } 
        }return true;

    }
    /**
 * Skriver ut Sudoku-brettet til skjermen.
 */
    public void skrivUtBrett(){

        for(int rad = 0; rad < N; rad++){
            for(int kol = 0; kol < N; kol++){
                System.out.print(brett[rad][kol] + " ");
                
            }
            System.out.println();
        }
    }
    /**
 * Sjekker om et tall kan plasseres på en gitt posisjon.
 * @param rad radindeksen til cellen
 * @param kol kolonneindeksen til cellen
 * @param num tallet som skal sjekkes
 * @return true hvis tallet er gyldig, false hvis det allerede finnes i rad, kolonne eller 3x3-boks
 */
    public boolean erRiktig(int rad, int kol, int num){
        for(int x = 0; x < N; x++){
            if(rader[rad].getVerdi(x) == num ||
                kolonner[kol].getVerdi(x) == num ||
                rader[rad - rad%3 + x/3].getVerdi(kol - kol%3 + x%3) == num){
                return false;
        }
    }
    return true;
}
}