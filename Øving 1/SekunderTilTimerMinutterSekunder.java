public class SekunderTilTimerMinutterSekunder {

    public static void konverter(int totalSekunder)
    {
        int timer = totalSekunder / 3600;
        int resterende = totalSekunder % 3600;
        int minutter = resterende / 60;
        int sekunder = resterende % 60;

        System.out.println("Timer: " + timer + ", Minutter: " + minutter + ", Sekunder " + sekunder);
    }

    public static void main(String[] args) {
        int[] testdata = {
                0,
                1,
                45,
                60,
                601,
                3599,
                3600,
                4000,
                8399,
        };

        System.out.println("Testresultater:");

        for (int i = 0; i < testdata.length; i++) {
            konverter(testdata[i]);
        }
    }
}
