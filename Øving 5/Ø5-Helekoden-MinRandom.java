import java.util.Random;

public class MinRandom {
    private Random random;
    
    public MinRandom() {
        random = new Random();
    }

    public int nesteHeltall(int nedre, int øvre) {
        if (nedre >= øvre -1) {
            throw new IllegalArgumentException("Ikke gyldig");
        }
        return nedre + 1 + random.nextInt(øvre - nedre - 1);
    }
    public double nesteDesimaltall(double nedre, double øvre) {
        if (nedre >= øvre) {
            throw new IllegalArgumentException("Ugyldig");
        }
        return nedre + random.nextDouble() * (øvre - nedre);
    }
}   

public class TestMinRandom {
    public static void main(String[] args){
        MinRandom MR = new MinRandom();
        boolean feilfunnet = false;

        //Test
        for (int i = 0; i < 77; i++) {
            int tall = MR.nesteHeltall(7, 77);
            System.out.println(tall);
            if (tall <= 7 || tall >= 77) {
                System.out.println("Tallet er utenfor intervallet");
                feilfunnet = true;
            }
        }

        for (int i = 0; i < 17.7; i++) {
            double tall = MR.nesteDesimaltall(0.7, 17.7);
            System.out.println(tall);
            if (tall <0.7 || tall >= 1.5) {
                System.out.println("Ugyldig");
            }
           
        }
    }
}
