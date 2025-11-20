public class TestNyString {
    public static void main(String[] args) {
        NyString ny = new NyString("denne setningen kan forkortes");

        System.out.println("\nForkortet/første bokstav: " + ny.forkort());
        System.out.println("Uten e: " + ny.fjernTegn('e')); 
    }
}