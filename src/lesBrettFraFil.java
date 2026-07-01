import java.io.*;

public class lesBrettFraFil {

public static int[][] lesBrettFraFil(String filnavn, String vanskelighetsgrad) {
    int[][] brett = new int[9][9];
    int skip = 0;


    switch (vanskelighetsgrad.toLowerCase()) {
        case "open":   skip = 0; break;
        case "easy":   skip = 324; break;
        case "medium": skip = 648; break;
        case "hard":   skip = 972; break;
    }

    try (DataInputStream dis = new DataInputStream(new FileInputStream(filnavn))) {
        dis.skipBytes(skip);

        for (int r = 0; r < 9; r++) {
            for (int k = 0; k < 9; k++) {

                brett[r][k] = dis.readInt();
            }
        }
    } catch (IOException e) {
        System.err.println("Feil ved lesing av fil: " + e.getMessage());
    }
    return brett;
}

}
