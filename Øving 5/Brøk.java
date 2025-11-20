public class Brøk {
    private int teller;
    private int nevner;

    public Brøk(int teller, int nevner) {
        if (nevner == 0) {
            throw new IllegalArgumentException("Nevner kan ikke være 0");
        }
        this.teller = teller;
        this.nevner = nevner;
    }

    public Brøk(int teller) {
        this.teller = teller;
        this.nevner = 1;
    }

    public int getTeller() {
        return teller;
    }

    public int getNevner() {
        return nevner;
    }

    public void summer(Brøk annen) {
        this.teller = this.teller * annen.nevner + annen.teller * this.nevner;
        this.nevner = this.nevner * annen.nevner;
    }

    public void subtraher(Brøk annen) {
        this.teller = this.teller * annen.nevner - annen.teller * this.nevner;
        this.nevner = this.nevner * annen.nevner;
    }

    public void multipliser(Brøk annen) {
        teller = teller * annen.teller;
        nevner = nevner * annen.nevner;
    }

    public void divider(Brøk annen) {
        if (annen.teller == 0) {
            throw new IllegalArgumentException("Kan ikke dividere med teller 0");
        }
        teller = teller * annen.nevner;
        nevner = nevner * annen.teller;
    }

    @Override
    public String toString() {
        return teller + "/" + nevner;
    }

    // Testklient
    public static void main(String[] args) {
        Brøk brøk1 = new Brøk(2, 10);
        Brøk brøk2 = new Brøk(3, 4);

        System.out.println("Brøk en = " + brøk1);
        System.out.println("Brøk to = " + brøk2);

        // Summer
        brøk1.summer(brøk2);
        System.out.println("Brøk en pluss brøk to: " + brøk1);

        // Subtraher
        brøk1 = new Brøk(2, 10);
        brøk1.subtraher(brøk2);
        System.out.println("Brøk en minus brøk to: " + brøk1);

        // Multipliser
        brøk1 = new Brøk(2, 10);
        brøk1.multipliser(brøk2);
        System.out.println("Brøk en multiplisert med brøk to : " + brøk1);

        // Divisjon
        brøk1 = new Brøk(2, 10);
        brøk1.divider(brøk2);
        System.out.println("Brøk en dividert med brøk to: " + brøk1);
    }
}