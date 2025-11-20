public class Gangetabell{
    //Lag et program som skriver ut en del av multiplikasjonstabellen

    public static void main(String[] args) {
         System.out.println("Gangetabell for 7-9:");
        for(int i = 7; i <= 9; i++) {
            for( int j = 1; j <= 10; j++) {
            System.out.println(i + "x" + j + "=" + (i*j));
            }
        }
    
    }
}
