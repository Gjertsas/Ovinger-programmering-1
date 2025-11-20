/* Lag et klientprogram som går i løkke. I hvert løkkegjennomløp skal klienten skrive inn en 
tekst, og resultatet av alle analysene foran skal skrives ut. */
import java.util.Scanner;

public class TekstanalyseKlient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Skriv inn en tekst (eller 'avslutt' for å avslutte): ");
            String tekst = scanner.nextLine();
            if (tekst.equalsIgnoreCase("avslutt")) break;

            Tekstanalyse analyse = new Tekstanalyse(tekst);

            System.out.println("Antall forskjellige bokstaver: " + analyse.AntallForskjelligeBokstaver());
            System.out.println("Totalt antall bokstaver: " + analyse.TotaltAntallBokstaver());
            System.out.printf("Prosent ikke-bokstaver: %.2f%%\n", analyse.ProsentIkkeBokstaver()); //Hvordan gjøre dette uten printf?

            System.out.print("Skriv inn en bokstav for å finne antall forekomster: ");
            char bokstav = scanner.nextLine().charAt(0);
            int antall = analyse.AntallAv(bokstav);
            if (antall >= 0) {
                System.out.println("Antall forekomster av '" + bokstav + "': " + antall);
            } else {
                System.out.println("'" + bokstav + "' er ikke en gyldig bokstav.");
            }

            System.out.println("Vanligste bokstaver: " + analyse.VanligsteBokstaver());
        }

        scanner.close();
    }
}