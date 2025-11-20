import java.util.Scanner;

public class Primtall {
/*Skriv et program som finner ut om et tall er et primtall. Et primtall er et tall som kun kan deles 
med 1 og med seg selv uten å få rest. Les inn tallet fra brukeren og la programmet repetere 
slik at flere tall kan analyseres*/

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String svar;

         do {
            System.out.print("Skriv inn et heltall: ");
            int tall = scanner.nextInt();

            if (erPrimtall(tall)) {
                System.out.println(tall + " er et primtall.");
            } else {
                System.out.println(tall + " er ikke et primtall.");
            }
        System.out.print("Vil du sjekke et nytt tall? (ja/nei): ");
            svar = scanner.next();
        } while (svar.equals("ja"));

        System.out.println("Program slutt");
        scanner.close();
    }

    public static boolean erPrimtall(int n){
    if (n <= 1) return false;
    for (int i = 2; i < n; i++) {
        if (n % i == 0) return false;
        }
    return true;
    }

}
