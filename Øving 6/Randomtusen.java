/*Lag et program som går i løkke for eksempel 1000 ganger og henter ut tilfeldige tall. 
I tabellen antall skal du lagre antall ganger hvert enkelt av tallene 0, 1, …, 9 er hentet ut. 
Til slutt skriver du ut en liste over antall forekomster av hvert enkelt av de ti tallene */

import java.util.Random;

public class Randomtusen {
    public static void main(String[] args) {
         
        Random random = new Random();
        int[] antall = new int[10];

        for (int i = 0; i < 1000; i++) {
            int tall = random.nextInt(10);
            antall[tall]++;
        }

    System.out.println("Antall av hvert tall:");
        for (int i = 0; i < antall.length; i++) {
            System.out.println("Tall " + i + ": " + antall[i]);
        }
    }
}  