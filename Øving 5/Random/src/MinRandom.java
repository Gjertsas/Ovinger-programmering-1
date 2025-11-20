import java.util.Random;

public class MinRandom {
    private Random random;
    
    public MinRandom() {
        random = new Random();
    }

    public int nesteHeltall(int nedre, int øvre) {
        if (nedre > øvre) {
            throw new IllegalArgumentException("Ikke gyldig");
        }
        return nedre + random.nextInt(øvre - nedre + 1);
    }
    public double nesteDesimaltall(double nedre, double øvre) {
        if (nedre > øvre) {
            throw new IllegalArgumentException("Ugyldig");
        }
        return nedre + random.nextDouble() * (øvre - nedre);
    }
}   