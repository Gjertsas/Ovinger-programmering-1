//Klassen
public class Rett {
    private String navn;
    private String typeRett;
    private double pris;
    private String oppskrift;

//Konstruktør
    public Rett(String navn, String typeRett, double pris, String oppskrift) {
        this.navn = navn;
        this.typeRett = typeRett;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }

//Get-metoder    
    public String getNavn() {
        return navn;
    }

    public String getTypeRett() {
        return typeRett;
    }

    public double getPris() {
        return pris;
    }

    public String getOppskrift() {
        return oppskrift;
    }

//toString for ryddig tekst
    @Override
    public String toString() {
        return navn + " (" + typeRett + ") - " + pris + " kr";
    }
}
