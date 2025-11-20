public class TimerMinutterSekunder {
    public static void main(String[] args) {
        int[][] testdata = {
            {0, 0, 0},
            {1, 0, 0},
            {0, 1, 0},
            {1, 1, 1},
            {0, 30, 45},
            {1, 15, 30},
            {3, 28, 59},
        };
    
        System.out.println("Testresultater:");

        for (int i = 0; i < testdata.length; i++) {
            int timer = testdata[i][0];
            int minutter = testdata[i][1];
            int sekunder = testdata[i][2];
            int total = timer * 3600 + minutter * 60 + sekunder;
            //System.out.printf("Test %d: %dt %dm %ds → %d sekunder%n", i + 1, timer, minutter, sekunder, total);
            System.out.println("Total: " + total);
        }
    }
}


