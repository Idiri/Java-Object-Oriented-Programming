import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//Test med:
/*
https://example.com/ – enkel HTML-side (alltid tilgjengelig)
https://www.google.com/robots.txt – ren tekst, liten
https://www.wikipedia.org/ – HTML-side, ofte tilgjengelig
https://www.w3.org/TR/PNG/iso_8859-1.txt – klassisk eksempeltekst (ISO/UTF-8 fungerer)
En rå tekstfil fra GitHub (velg Raw):
https://raw.githubusercontent.com/eclipse/deeplearning4j/master/LICENSE
Norske sider:
https://www.vg.no/robots.txt
https://www.nrk.no/robots.txt
 */

public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.print("Enter a URL (e.g., https://example.com): ");
        String URLString = new Scanner(System.in).nextLine().trim();

        // Hvis brukeren skrev "www.noe.no", legg til https:// automatisk
        if (!URLString.matches("(?i)^https?://.*")) {
            URLString = "https://" + URLString;
        }

        try {
            URL url = new URL(URLString);

            // Åpne forbindelse og sett noen fornuftige headere/timeouts
            URLConnection conn = url.openConnection();
            conn.setConnectTimeout(10_000); // 10 sekunder
            conn.setReadTimeout(15_000);    // 15 sekunder
            conn.setRequestProperty("User-Agent",
                    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) Java/URLReader");

            int charCount = 0;

            // Les som tekst (UTF-8) linje for linje
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    // Skriv ut linjen (ikke Scanner-objektet)
                    System.out.println(line);
                    // Tell antall tegn (pluss linjeskift hvis du vil matche "visning")
                    charCount += line.length() + 1; // +1 for newline
                }
            }

            System.out.println("The file size is " + charCount + " characters (UTF-8, lines + newline).");

        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL: " + ex.getMessage());
        } catch (java.io.IOException ex) {
            System.out.println("IO error: " + ex.getMessage());
        }
    }
}