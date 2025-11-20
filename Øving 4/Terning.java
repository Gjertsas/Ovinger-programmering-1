import java.util.Random;

public class Terning {
    private int sumPoeng = 0;
    private Random terning = new Random();

    public int getSumPoeng() {
        return sumPoeng;
    }

    public boolean erFerdig(){
        return sumPoeng >= 100;
    }

    public void kastTerningen(){
        int kast = terning.nextInt(6) + 1;
        System.out.println("Kastet " + kast);

        if (kast == 1) {
            sumPoeng = 0;
            System.out.println("Poeng nullstilles");
        } else {
            sumPoeng += kast;
            System.out.println("Du kastet " + kast + " og har totalt " + sumPoeng + " poeng");
        }
    }

    public static void main(String[] args) {
        Terning spillerA = new Terning();
        Terning spillerB = new Terning();
        int runde = 1;

        while (!spillerA.erFerdig() && !spillerB.erFerdig()){
            System.out.println("Ny runde " + runde);

            System.out.println("Spiller A:");
            spillerA.kastTerningen();
            System.out.println("Poengsum A: " + spillerA.getSumPoeng());

            if (spillerA.erFerdig()) break;
            
            System.out.println("Spiller B:");
            spillerB.kastTerningen();
            System.out.println("Spiller B: " + spillerB.getSumPoeng());

            runde++;
        }

            System.out.println("Spillet er over!");
            if (spillerA.erFerdig()) {
            System.out.println("Spiller A vant!");
            } else {
            System.out.println("Spiller B vant!");
            }
    }
}