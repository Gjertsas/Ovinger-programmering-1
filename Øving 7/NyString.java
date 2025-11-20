/*Klassen String inneholder mange metoder. Vi skal nå lage noen flere. 
Lag en klasse som heter NyString. Den skal ha en objektvariabel av klassen String. Klassen 
NyString skal være immutabel og tilby følgende tjenester: 

• Konstruktør som tar et objekt av klassen String som argument. 
• Forkorting. Forkortingen skal skje ved at første tegn i hvert ord plukkes ut. Bruk 
mellomrom som skille mellom ordene. Eksempel: «denne setningen kan forkortes» 
skal forkortes til «dskf». Tips: Bruk String-metoden split(), som returnerer en tabell 
med ordene som teksten består av: String() ord = tekst.split() 
• Fjerning av tegn. Eksempel: Dersom tegnet ‘e’ fjernes fra teksten «denne setningen 
kan forkortes», står vi igjen med «dnn stningn kan forkorts». Tips: Bruk en while
løkke og for eksempel String-metodene indexOf() og substring(). */

//Immutabel variabel, kan ikke endres senere i koden
public final class NyString {
    private final String tekst;

//Konstruktør
    public NyString(String tekst) {
        this.tekst = tekst;
    }
    
// Metode 1
    public String forkort() { 
        String[] ord = tekst.split(" "); //Deler opp basert på mellomrom
        
        StringBuilder resultat = new StringBuilder();
        for (String o : ord) {
            if (!o.isEmpty()) { //Sjekker at ordet ikke er tomt, eks ved flere mellomrom på rad
                resultat.append(o.charAt(0)); //Returnerer første bokstav i hvert ord til resultat
            }
        }
        return resultat.toString();
    }
// Metode 2
    public String fjernTegn(char tegn) {
    String resultat = tekst;
    int indeks = resultat.indexOf(tegn);

    while (indeks != -1) {
        resultat = resultat.substring(0, indeks) + resultat.substring(indeks + 1);
        indeks = resultat.indexOf(tegn);
    }
    return resultat;
    }
}




