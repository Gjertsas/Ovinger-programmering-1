public class TommerTilCm {
    public static void main(String[] args) 
    {
        final double TOMMER_TIL_CM = 2.54;
        double[] testdata = {0, 1, 3, 5, 10, 13.5};

        for (double tommer : testdata) 
        {
            double cm = tommer * TOMMER_TIL_CM;
            System.out.println(tommer + "tommer = " + cm + "cm");
        }
    }
}
