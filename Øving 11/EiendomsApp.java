import java.util.Scanner;

public class EiendomsApp {
        EiendomsRegister register = new EiendomsRegister();
        Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        EiendomsApp app = new EiendomsApp();
        app.start();
    }
//Meny-systemet
    public void start() {
        boolean ferdig = false;
        while (!ferdig) {
            visMeny();
            int valg = lesInt("Velg et menyvalg:");
            switch (valg) {
                case 1:
                    registrerEiendom();
                    break;
                case 2:
                    register.skrivUtAlle();
                    break;
                case 3:
                    søkEtterEiendom();
                    break;
                case 4:
                    register.gjennomsnittAreal();
                    break;
                case 5:
                    System.out.println("Avslutter applikasjonen");
                    ferdig = true;
                    break;
                default:
                    System.out.println("Ugyldig input, prøv igjen.");
                    break;
            }
            System.out.println();
        }
    }

    private void visMeny() {
        System.out.println("-- Eiendomsregister --");
        System.out.println("1. Registrer ny eiendom");
        System.out.println("2. Skriv ut alle eiendommer");
        System.out.println("3. Søk etter eiendom");
        System.out.println("4. Beregn gjennomsnittlig areal");
        System.out.println("5. Avslutt");
    }

//Metode for registrering av ny eiendom
    private void registrerEiendom() {
        System.out.println("Registrer ny eiendom");
        scanner.nextLine();
        String kommuneNavn = lesTekst("Kommune: ");
        int kommuneNummer = lesInt("Kommunenummer: ");
        scanner.nextLine();
        int gårdsNummer = lesInt("Gårdsnummer: ");
        scanner.nextLine();
        int bruksNummer = lesInt("Bruksnummer: ");
        scanner.nextLine();
        String bruksNavn = lesTekst("Bruksnavn (valgfritt): ");
        double areal = lesDouble("Areal (m2): ");
        scanner.nextLine();
        String eier = lesTekst("Eier: ");

        Eiendom e = new Eiendom(kommuneNavn, kommuneNummer, gårdsNummer, bruksNummer, bruksNavn, areal, eier);
        register.leggTil(e);
        System.out.println("Eiendom registrert: " + e);
    }

    private void søkEtterEiendom() {
        System.out.println("Søk etter eiendom: ");
        int kommuneNummer = lesInt("Kommunenummer: ");
        int gårdsNummer = lesInt("Gårdsnummer: ");
        int bruksNummer = lesInt("Bruksnummer: ");
        register.søk(kommuneNummer, gårdsNummer, bruksNummer);
    }

    private int lesInt(String tekst){
        System.out.print(tekst);
        while (!scanner.hasNextInt()) {
            System.out.println("Ugyldig tall, prøv igjen");
            scanner.next();
            System.out.print(tekst);
        }
        return scanner.nextInt();
    }

    private double lesDouble(String tekst) {
        System.out.print(tekst);
        while (!scanner.hasNextDouble()){
            System.out.println("Ugyldig input, prøv igjen");
            scanner.next();
            System.out.print(tekst);
        }
        return scanner.nextDouble();
    }

    private String lesTekst(String tekst) {
        System.out.print(tekst);
        return scanner.nextLine();
    }
}


