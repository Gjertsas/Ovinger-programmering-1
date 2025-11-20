public class Kjøttdeig {
    /*Oppgave 2 
    Lag et program som hjelper oss i forhold til følgende problemstilling:
    Kjøttdeig av merke A koster kr 35,90 for 450 gram, mens kjøttdeig av merke B koster kr 39,50 for 500 gram. 
    Hvilket merke er billigst? */

    // Ønsker å finne g/kr og la programmet kjøre ut xx hvis A < B
    public static void main(String[] args) {
    // Merke A
        double prisA = 35.90;
        int gramA = 450;
    // Merke B
        double prisB = 39.50;
        int gramB = 500;
    // kr/g
        double prisdeltpågramA = (prisA/gramA);
        double prisdeltpågramB = (prisB/gramB);
        double avrundetA = Math.round(prisdeltpågramA * 1000) / 1000.0;
        double avrundetB = Math.round(prisdeltpågramB * 1000) / 1000.0;
 
        System.out.println("For merke A er pris per gram lik: kr " + avrundetA);
        System.out.println("For merke B er pris per gram er lik: kr " + avrundetB);

    //if-setninger
        if (avrundetA > avrundetB)
            System.out.println("Merke B er billigst");
        else
            System.out.println("Merke A er billigst");
    }
}
