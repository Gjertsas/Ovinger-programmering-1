public class TestMinRandom {
    public static void main(String[] args){
        MinRandom MR = new MinRandom();
        boolean feilfunnet = false;

        //Test
        for (int i = 0; i < 27; i++) {
            int tall = MR.nesteHeltall(7, 27);
            System.out.println(tall);
            if (tall <= 7 || tall >= 27) {
                System.out.println("Tallet er utenfor intervallet");
                feilfunnet = true;
            }
        }

        for (int i = 0; i < 8; i++) {
            double tall = MR.nesteDesimaltall(0.7, 7.7);
            System.out.println(tall);
            if (tall <0.7 || tall >= 7.7) {
                System.out.println("Dette tallet er utenfor ønsket intervall");
            }
        if (!feilfunnet) {
            System.out.println("Alle tall ok");
        }
        }
    }
}
