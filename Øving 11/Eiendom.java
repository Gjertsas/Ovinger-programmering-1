//Klasse med attributter til en eiendom
public class Eiendom {
    private String kommuneNavn;
    private int kommuneNummer;
    private int gårdsNummer;
    private int bruksNummer;
    private String bruksNavn;
    private double areal;
    private String eier;

//Konstruktør
    public Eiendom(String kommuneNavn, int kommuneNummer, int gårdsNummer, int bruksNummer, String bruksNavn, double areal, String eier) {
        this.kommuneNavn = kommuneNavn;
        this.kommuneNummer = kommuneNummer;
        this.gårdsNummer = gårdsNummer;
        this.bruksNummer = bruksNummer;
        this.bruksNavn = bruksNavn;
        this.areal = areal;
        this.eier = eier;
    }

//Sjekke at knr, bnr og bnr matcher
    public boolean matcher(int kommuneNummer, int gårdsNummer, int bruksNummer) {
        return this.kommuneNummer == kommuneNummer &&
        this.gårdsNummer == gårdsNummer &&
        this.bruksNummer == bruksNummer;
    }

//Get-metode for areal
    public double getAreal() {
        return areal;
    }

//toString for tekstlig visning av klassen
    @Override
    public String toString() {
        String id = kommuneNavn + " - " + kommuneNummer + "-" + gårdsNummer + "/" + bruksNummer;
        String navn = bruksNavn.isEmpty() ? "(ingen bruksnavn)" : bruksNavn;
        return id + " " + navn + " Areal: " + String.format("%.1f", areal) + " m2, Eier: " + eier;
    }
}
