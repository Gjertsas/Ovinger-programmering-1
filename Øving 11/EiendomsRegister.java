import java.util.*;

public class EiendomsRegister {
    private List<Eiendom> eiendommer = new ArrayList<>();

//Metoder    
    public void leggTil(Eiendom e) {
        eiendommer.add(e);
    }

    public void skrivUtAlle() {
        if (eiendommer.isEmpty()) {
            System.out.println("Ingen eiendommer registrert");
        } else {
            for (Eiendom e : eiendommer) {
                System.out.println(e);
            }
        }
    }

    public void søk(int kommuneNummer, int gårdsNummer, int bruksNummer) {
        for (Eiendom e : eiendommer) {
            if (e.matcher(kommuneNummer, gårdsNummer, bruksNummer)) {
                System.out.println("Funnet: " + e);
                return;
            }
        }
        System.out.println("Ingen eiendom funnet med oppgitte verdier");
    }

    public void gjennomsnittAreal() {
        if (eiendommer.isEmpty()) {
            System.out.println("Ingen eiendommer registrert");
            return;
        }
        double total = 0;
        for (Eiendom e : eiendommer) {
            total += e.getAreal();
        }
        double snitt = total / eiendommer.size();
        snitt = Math.round(snitt*100)/100.0;
        System.out.println("Gjennomsnittlig areal: " + snitt + " m2");
    }
}
