import java.io.*;

public class Oblig3SudokuSolver_271550 {

    public static void main(String[] args) {
        int[][] brett = lesBrettFraFil("puzzle.dat", "easy");
        SudokuBrett sudoku = new SudokuBrett(brett);
        System.out.println("--- Uløst brett ---");
        sudoku.skrivUtBrett();
        System.out.println("--- Løsning ---");
        if(sudoku.finnRiktigVerdi()){
            sudoku.skrivUtBrett();
        }
        
        
    }

    /**
 * Leser et Sudoku-brett fra en binær fil.
 * @param filnavn navnet på filen som skal leses
 * @param vanskelighetsgrad "open", "easy", "medium" eller "hard"
 * @return et 9x9 int-array med tallene fra brettet
 */



    public static int[][] lesBrettFraFil(String filnavn, String vanskelighetsgrad) {
    int[][] brett = new int[9][9];
    int skip = 0;

    switch (vanskelighetsgrad.toLowerCase()) {
    case "open":   skip = 5;   break;  // 1 + 4 ("open")
    case "easy":   skip = 91;  break;  // 5 + 81 + 5
    case "medium": skip = 179; break;  // 91 + 81 + 7
    case "hard":   skip = 265; break;  // 179 + 81 + 5
}

    try (DataInputStream dis = new DataInputStream(new FileInputStream(filnavn))) {
        dis.skipBytes(skip);
        for (int r = 0; r < 9; r++) {
            for (int k = 0; k < 9; k++) {
                brett[r][k] = dis.readByte();
            }
        }
    } catch (IOException e) {
        System.err.println("Feil ved lesing av fil: " + e.getMessage());
    }
    return brett;
}
}
