/*Oppgave 2 
Lag en klasse for enkel tekstbehandling. Konstruktøren skal ta en tekst som argument. 
Klassen skal tilby følgende tjenester: 
• Å finne antall ord i teksten. 
• Å finne gjennomsnittlig ordlengde. Skilletegn er ikke en del av ordene. 
• Å finne gjennomsnittlig antall ord per periode. Bruk punktum, utropstegn, kolon og 
spørretegn som skilletegn mellom periodene. Anta at teksten er feilfri, slik at ikke to 
eller flere slike tegn følger etter hverandre. 
• Å skifte ut et ord med et annet gjennom hele teksten. For eksempel kan en ønske å 
skifte ut ordet «finnes» med «fins». 
• Å hente ut teksten slik den står, uten endringer. 
• Å hente ut teksten, men slik at alle bokstaver er store. 
Lag en enkel testklient. Husk å prøve klassen for tekster som inneholder æ, ø og å. */


//Variabel
public class Tekstbehandling {
    private String tekst;

//Konstruktør
    public Tekstbehandling(String tekst) {
        this.tekst = tekst;
    }

//Metoder    
    public int finnAntallOrd() {
        int antallOrd = 0;
        boolean iOrd = false;

        for (int i = 0; i < tekst.length(); i++) {
            char c = tekst.charAt(i);

            if (Character.isLetter(c)) { //Sjekker om tegn er bokstav
                if(!iOrd) {
                antallOrd++;
                iOrd = true;
            }
        } else {
            iOrd = false;
        }
    }
    return antallOrd;
}
    /*String[] ord = tekst.split("[\\s\\p{Punct}]+");
    return ord.length;*/

    public double gjennomsnittligOrdlengde() {
        int totalBokstaver = 0;
        int antallOrd = 0;
        boolean iOrd = false;

        for (int i = 0; i < tekst.length(); i++){
            char c = tekst.charAt(i);

            if (Character.isLetter(c)) {
                totalBokstaver++;
                if (!iOrd) {
                    antallOrd++;
                    iOrd = true;
                }
            } else {
                iOrd= false;
            }
        }
        return antallOrd == 0 ? 0 : (double) totalBokstaver / antallOrd;
    }


        // String[] ord = tekst.split("[\\s\\p{Punct}]+");
        // int totalLengde = 0;
        // for (String o : ord) {
        //     totalLengde += o.length();
        // }
        // return ord.length == 0 ? 0 : (double) totalLengde / ord.length;
    


    public double gjennomsnittligOrdPerPeriode() { 
        String[] perioder = tekst.split("[.!?:]"); //Sjekker antall ord per "setning", oppdelt med .!?:
        int totalOrd = finnAntallOrd();
        return perioder.length == 0 ? 0 : (double) totalOrd / perioder.length;
    }

    public void erstattOrd(String gammeltOrd, String nyttOrd) {
        tekst = tekst.replaceAll("\\b" + gammeltOrd + "\\b", nyttOrd);
    }

    public String hentTekst() {
        return tekst;
    }

    public String hentTekstMedStoreBokstaver() {
        return tekst.toUpperCase();
    }
}

