import java.util.*;

//Klassen
public class ArrangementRegister {
    private List<Arrangement> arrangementer;

//Konstruktør
    public ArrangementRegister() {
        arrangementer = new ArrayList<>();
    }

//Metoder
    public void registrerArrangement(Arrangement a) {
        arrangementer.add(a);
    }

    public List<Arrangement> finnArrangementerPåSted(String sted) {
        List<Arrangement> resultat = new ArrayList<>();
        for (Arrangement a : arrangementer) {
            if (a.getSted().equalsIgnoreCase(sted)) {
                resultat.add(a);
            }
        }
        return resultat;
    }

    public List<Arrangement> finnArrangementerPåDato(long dato) {
        List<Arrangement> resultat = new ArrayList<>();
        for (Arrangement a : arrangementer) {
            long arrangementDato = a.getTidspunkt() / 10000; //Fjerner timer og minutter
            if (arrangementDato == dato) {
                resultat.add(a);
            }
        }
        return resultat;
    }

    public List<Arrangement> finnArrangementerITidsintervall(long start, long slutt) {
        List<Arrangement> resultat = new ArrayList<>();
        for (Arrangement a : arrangementer) {
            if (a.getTidspunkt() >= start && a.getTidspunkt() <= slutt) {
                resultat.add(a);
            }
        }
        resultat.sort(Comparator.comparingLong(Arrangement::getTidspunkt));
        return resultat;
    }

    public List<Arrangement> sorterEtterSted() {
        List<Arrangement> kopi = new ArrayList<>(arrangementer);
        kopi.sort(Comparator.comparing(Arrangement::getSted));
        return kopi;
    }

    public List<Arrangement> sorterEtterType() {
        List<Arrangement> kopi = new ArrayList<>(arrangementer);
        kopi.sort(Comparator.comparing(Arrangement::getType));
        return kopi;
    }
    

    public List<Arrangement> sorterEtterTidspunkt() {
        List <Arrangement> kopi = new ArrayList<>(arrangementer);
        kopi.sort(Comparator.comparing(Arrangement::getTidspunkt));
        return kopi;
    }

//Returner kopi av hele listen med arrangementer
    public List<Arrangement> hentAlle() {
        return new ArrayList<>(arrangementer);
    }
}
