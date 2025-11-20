import java.util.Scanner;

public class Klient {
    public static void main(String[] args) {
        Person p = new Person("Sivert", "Gjertsås", 1997);
        Arbtaker a = new Arbtaker(p, 67, 2020, 33337, 30);

        Scanner scanner = new Scanner(System.in);
        boolean fortsett = true;

//Meny-løkke
        while (fortsett) {
            System.out.println("Meny");
            System.out.println("1. Vis info");
            System.out.println("2. Endre lønn");
            System.out.println("3. Endre skatteprosent");
            System.out.println("4. Avslutt");
            System.out.println("Valg:");

            int valg = scanner.nextInt();

//Switch som viser info fra meny-løkken
        switch (valg) {
            case 1:
                System.out.println(a);
                System.out.println("Skatt per måned: " + a.skattPerMåned());
                System.out.println("Bruttolønn per år: " + a.bruttolønnperår());
                System.out.println("Skattetrekk per år: " + a.skattetrekkPerÅr());
                System.out.println("Alder: " + a.alder());
                System.out.println("Antall år ansatt; " + a.AntallÅrAnsatt());
                break;
            case 2: 
                System.out.println("Ny lønn: ");
                int nyLønn = scanner.nextInt();
                a.setMånedslønn(nyLønn);
                break;
            case 3:
                System.out.println("Ny skatteprosent");
                double nySkatteprosent = scanner.nextDouble();
                a.setSkatteprosent(nySkatteprosent);
                break;
            case 4:
                fortsett = false;
                break;
            default:
                System.out.println("Ugyldig input");
        }
        }
        scanner.close();
    }

}
