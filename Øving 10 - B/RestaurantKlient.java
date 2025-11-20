//Klasen
public class RestaurantKlient {
    public static void main(String[] args) {
        MenyRegister register = new MenyRegister();
        //Opprettet menyregister

//Rett-registrering
        Rett r1 = new Rett("Grønnsakssuppe", "Forrett", 79, "Buljong, potet, gulrot, purreløk");
        Rett r2 = new Rett("Biff", "Hovedrett", 399, "Indrefilet av storfe, bearnaissaus, potetbåter, asparges");
        Rett r3 = new Rett("Varme multer med vaniljeis", "Dessert", 119, " Multer, vaniljeis");
        Rett r4 = new Rett("Kaffe", "Dessert", 29, "Kaffe");

        register.registrerRett(r1);
        register.registrerRett(r2);
        register.registrerRett(r3);
        register.registrerRett(r4);
        
//Meny-opprettelse
        Meny meny1 = new Meny();
        meny1.leggTilRett(r1);
        meny1.leggTilRett(r2);
        meny1.leggTilRett(r3);
        meny1.leggTilRett(r4);

        register.registrerMeny(meny1);


        System.out.println("\n Finn rett 'Biff': " + register.finnRett("Biff"));
        System.out.println("\n Desserter: " + register.finnRetterAvType("Dessert"));
        System.out.println("\n Menyer mellom 200 og 1000 kr: \n" + register.finnMenyerInnenforPris(300, 1000));


    }


}
