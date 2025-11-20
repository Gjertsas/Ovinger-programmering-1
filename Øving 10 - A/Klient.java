import java.util.*;

//Klientklassen
public class Klient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrangementRegister register = new ArrangementRegister();
//Opprettet tomt register for lagring av arrangementer

//Meny-løkke
        boolean fortsett = true;
        while (fortsett) {
            System.out.println("\nMeny");
            System.out.println("1. Registrer nytt arrangement");
            System.out.println("2. Finn arrangementer på sted");
            System.out.println("3. Finn arrangementer på dato (YYYYMMDD");
            System.out.println("4. Finn arrangementer i tidsintervall");
            System.out.println("5. List alle arrangementer sortert etter sted");
            System.out.println("6. List alle arrangementer sortert etter arrangementtype");
            System.out.println("7. List alle arrangementer sortert etter tidspunkt");
            System.out.println("8. Avslutt");
            System.out.println("Velg: ");

            int valg = scanner.nextInt();
            scanner.nextLine();

//Switch-struktur for meny
            switch (valg) {
                case 1: 
                System.out.print("Nummer: ");
                int nr = scanner.nextInt(); scanner.nextLine();
                System.out.print("Navn: ");
                String navn = scanner.nextLine();
                System.out.print("Sted: ");
                String sted = scanner.nextLine();
                System.out.print(" Arrangør: ");
                String arrangør = scanner.nextLine();
                System.out.print(" Arrangementtype: " );
                String type = scanner.nextLine();
                System.out.print("Tidspunkt (YYYYMMDDTTMM): ");
                long tid = scanner.nextLong();

                Arrangement a = new Arrangement(nr, navn, sted, arrangør, type, tid);
                register.registrerArrangement(a);
                System.out.println("Arrangement registrert");
                break;

            case 2: 
                System.out.print("Sted: "); 
                String s = scanner.nextLine();
                register.finnArrangementerPåSted(s).forEach(System.out::println);  
                break;
            
            case 3:
                System.out.print(" Dato (YYYYMMDD): ");
                long dato = scanner.nextLong();
                register.finnArrangementerPåDato(dato).forEach(System.out::println);
                break;

            case 4: 
                System.out.print("Start (YYYYMMDDTTMM): ");
                long start = scanner.nextLong();
                System.out.print("Slutt (YYYYMMDDTTMM): ");
                long slutt = scanner.nextLong();
                register.finnArrangementerITidsintervall(start, slutt).forEach(System.out::println);
                break;

            case 5: 
                register.sorterEtterSted().forEach(System.out::println);
                break;
            
            case 6:
                register.sorterEtterType().forEach(System.out::println);
                break;
            
            case 7:
                register.sorterEtterTidspunkt().forEach(System.out::println);
                break;

            case 8:
                fortsett = false;
                System.out.println("Avslutter program");
                break;

            default:
                System.out.println("Ugyldig valg");
            }
        }
        scanner.close();
    }
}
//Lagt til arrangement på A4-112 13.11.2025 kl 10.15
