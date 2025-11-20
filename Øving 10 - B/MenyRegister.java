import java.util.*;

//Klassen
public class MenyRegister {
    private Map<String, Rett> retter;
    private List<Meny> menyer;

//Konstruktør, oppretter tom HashMap for retter og tom ArrayList for menyer.
//Navnet på retten er nøkkelen og rett-objektet er verdien.
    public MenyRegister() {
        this.retter = new HashMap<>();
        this.menyer = new ArrayList<>();
    }

//Metoder
    public void registrerRett(Rett r) {
        retter.put(r.getNavn(), r);
    }

    public Rett finnRett(String navn) {
        return retter.get(navn);
    }

    public List<Rett> finnRetterAvType(String typeRett) {
        List<Rett> resultat = new ArrayList<>();
        for (Rett r : retter.values()) {
            if ( r.getTypeRett().equalsIgnoreCase(typeRett)) {
                resultat.add(r);
            }
        }
        return resultat;
    }

    public void registrerMeny(Meny m) {
        menyer.add(m);
    }

    public List<Meny> finnMenyerInnenforPris(double min, double max) {
        List<Meny> resultat = new ArrayList <>();
        for (Meny m: menyer) {
            double pris = m.getTotalPris();
            if (pris >= min && pris <= max) {
                resultat.add(m);
            }
        }
        return resultat;
    }
}

