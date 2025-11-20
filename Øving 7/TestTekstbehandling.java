public class TestTekstbehandling {
    public static void main(String[] args) {

    //Lagre tekst i variabel:    
        String eksempel = "Dette er en testtekst. Testtesttest. Æ, Ø og Å er med.";

        Tekstbehandling tb = new Tekstbehandling(eksempel);

//Printer ut eksempeltekst
        System.out.println("Original tekst:");
        System.out.println(tb.hentTekst());

//Kjører tekstanalyser
        System.out.println("\nAntall ord: " + tb.finnAntallOrd());
        System.out.println("Gjennomsnittlig ordlengde: " + tb.gjennomsnittligOrdlengde()); // 40/11
        System.out.println("Gjennomsnittlig antall ord per periode: " + tb.gjennomsnittligOrdPerPeriode()); // 11/3

//Erstatter ord
        tb.erstattOrd("testtekst", "forsinket oppgave");
        System.out.println("\nEtter erstatning av 'testtekst' med 'forsinket oppgave':");
        System.out.println(tb.hentTekst());

//Viser teksten med store bokstaver
        System.out.println("\nTekst med store bokstaver:");
        System.out.println(tb.hentTekstMedStoreBokstaver());
    }
}

