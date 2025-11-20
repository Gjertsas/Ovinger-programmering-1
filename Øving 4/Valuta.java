    /*Lag en klasse Valuta med minst en konstruktør. Klassen skal ha metoder for å regne fra og til 
    norske kroner.  
    Lag et klientprogram som oppretter minst tre objekter som representerer forskjellige valutaer. 
    Brukeren skal få tilbud om å regne om flere ulike beløp i de forskjellige valutaene til norske 
    kroner. 
    Programmet må altså presentere en meny for brukeren. Den kan for eksempel se sånn ut: 
    Velg valuta: 
    1: dollar 
    2: euro 
    3: svenske kroner  
    4: avslutt 
    Brukeren skriver inn ett av tallene 1, 2 eller 3 (eller 4 for avslutt). Dette skal styre 
    programflyten slik at riktig valutaobjekt blir brukt. */

    //Tegn aktivitetsdiagram + klassediagram

import java.util.Scanner;

public class Valuta {
    private String navn;
    private double kurs;

    public Valuta(String navn, double kurs) {
        this.navn = navn;
        this.kurs = kurs;
    }

    public double tilNOK(double belop) {
        return belop * kurs;
    }

    public double fraNOK(double nokBelop) {
        return nokBelop / kurs;
    }

    public String getNavn() {
        return navn;
    }

    public String toString() { //Hotfix via copilot fordi terminal spyttet ut " 10.0 Valuta@14ae5a5 tilsvarer 100.0 NOK" ved konvertering av 10 Dollar uten denne Stringen.
        return navn;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Valuta dollar = new Valuta("Dollar", 9.97);
        Valuta euro = new Valuta("Euro", 11.71);
        Valuta sek = new Valuta("Svenske kroner", 1.06);

        boolean fortsett = true;

        while (fortsett) {
            System.out.println("Velg valuta eller avslutt:");
            System.out.println("1: Dollar");
            System.out.println("2. Euro");
            System.out.println("3: Svenske kroner");
            System.out.println("4: Avslutt");
            int valg = scanner.nextInt();

            Valuta valgtValuta = null;

            switch (valg) {
                case 1 -> valgtValuta = dollar;
                case 2 -> valgtValuta = euro;
                case 3 -> valgtValuta = sek;
                case 4 -> {
                    fortsett = false;
                    System.out.println("Avslutter programmet.");
                    continue;
                }
                default -> {
                    System.out.println("Ugyldig valg. Prøv igjen.");
                    continue;
                }
            }

            System.out.print("Skriv inn beløp i " + valgtValuta.getNavn() + ": ");
            double belop = scanner.nextDouble();
            double nok = valgtValuta.tilNOK(belop);
            System.out.println(belop + " " + valgtValuta + " tilsvarer " + Math.round(nok*100)/100.0 + " NOK");
        }

        scanner.close(); 

    }
} 
