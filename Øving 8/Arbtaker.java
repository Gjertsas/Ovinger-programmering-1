/* Lag en klasse ArbTaker med attributter personalia (datatype Person), arbtakernr, ansettelsesår, 
månedslønn og skatteprosent. I tillegg til get-metoder for alle attributtene og set-metoder for å 
endre attributter som det er naturlig at bør kunne forandres, skal klassen tilby operasjoner som 
finner ut 
• Hvor mange kroner arbeidstakeren trekkes i skatt per måned; 
• Bruttolønn per år; 
• Skattetrekk per år. Husk at juni er skattefri og i desember betales halv skatt; 
• Navn på formen: etternavn, fornavn, eksempel: Johnsen, Berit; 
• Alder; 
• Antall år ansatt i bedriften; 
• Om personen har vært ansatt mer enn et gitt antall år (parameter); */

import java.util.GregorianCalendar;
import java.util.Calendar;

// kalender = new java.util.GregorianCalendar();
// int år = kalender.get(java.util.Calendar.YEAR);

//Klasse med etterspurte attributter
public class Arbtaker {
    private final Person personalia;
    private final int arbtakernr;
    private final int ansettelsesår;
    private double månedslønn;
    private double skatteprosent;

//Konstruktør
    public Arbtaker(Person personalia, int arbtakernr, int ansettelsesår, double månedslønn, double skatteprosent) {
        this.personalia = personalia;
        this.arbtakernr = arbtakernr;
        this.ansettelsesår = ansettelsesår;
        this.månedslønn = månedslønn;
        this.skatteprosent = skatteprosent;
    }

//Get-metoder

    public Person getPersonalia() {
        return personalia;
    }

    public int getArbtakern() {
        return arbtakernr;
    }

    public int getAnsettelsesår() {
        return ansettelsesår;
    }

    public double getMånedslønn() {
        return månedslønn;
    }

    public double getSkatteprosent() {
        return skatteprosent;
    }

//Set-metoder, slik at man kan endre lønn og skatteprosent

    public void setMånedslønn(double månedslønn) {
        this.månedslønn = månedslønn;
    }

    public void setSkatteprosent(double skatteprosent) {
        this.skatteprosent = skatteprosent;
    }

//Beregninger

    public double skattPerMåned() {
        return månedslønn * (skatteprosent /100);
    }
    public double bruttolønnperår() {
        return månedslønn * 12;
    }
    public double skattetrekkPerÅr() {
        double vanligSkatt = skattPerMåned();
        return (10 * vanligSkatt) + (0.5 * vanligSkatt); //Null skatt i juni og halv skatt i desember
    }


//Info om ansatt
    public String navn() {
        return personalia.getEtternavn() + ", " + personalia.getFornavn();   
    }

    public int alder() {
        GregorianCalendar kalender = new GregorianCalendar();
        int år = kalender.get(Calendar.YEAR);
        return år - personalia.getFødselsår();
    }

    public int AntallÅrAnsatt() {
        GregorianCalendar kalender = new GregorianCalendar();
        int nåværendeÅr = kalender.get(Calendar.YEAR);
            return nåværendeÅr - ansettelsesår;
    }

    public boolean harVærtAnsattMerEnn(int år) {
        return AntallÅrAnsatt() > år;
    }

    @Override
    public String toString() {
        return "Navn: " + navn();
    }
}

