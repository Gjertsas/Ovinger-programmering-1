//Klienklassen
public class Klient {
    public static void main(String[] args) {
        Oppgaveoversikt  oversikt = new Oppgaveoversikt(10);

//Registrering av studenter
        oversikt.registrerStudent("Sivert", 6);
        oversikt.registrerStudent("Bob", 6);
        oversikt.registrerStudent("Erik A", 0);

//Kaller på toString()-metoden i Oppgaveoversikt for å skrive ut studenter + antallOppg.
        System.out.println(oversikt);
        
//Øk antall godkjente
        oversikt.økAntallOppg("Sivert", 2);
        oversikt.økAntallOppg("Erik A", 7);
        
//Sjekk
        System.out.println("Sivert har nå " + oversikt.AntOppgaver("Sivert") + " oppgaver.");

        System.out.println(oversikt);
    }
}
