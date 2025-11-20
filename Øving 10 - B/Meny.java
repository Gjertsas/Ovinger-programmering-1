import java.util.ArrayList;
import java.util.List;

//Klassen
public class Meny {
    private List<Rett> retter;

//Konstruktør
    public Meny() {
        this.retter = new ArrayList<>();
    }

//Metoder
    public void leggTilRett(Rett r) {
        retter.add(r);
    }

    public List<Rett> getRetter() {
        return retter;
    }

    public double getTotalPris() {
        double sum = 0;
        for (Rett r : retter) {
            sum += r.getPris();
        }
        return sum;
    }
//toString 
    @Override
    public String toString() {
        return "Meny: " + retter.toString() + " --- Totalpris: " + getTotalPris() + " kr";
    }
}
