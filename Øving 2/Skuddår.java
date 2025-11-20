/* Aktivitetsdiagram
1. Start 
2. Les inn årstall fra test av tilfeldige år
3. Er årstall er delelig på 400? 
  Ja -> print "er et skuddår" 
4.  Nei -> Er årstall delelig med 100?
    Ja -> print "er ikke et skuddår"
5.    Nei -> Er årstall delelig med 4?
        Ja -> print "er et skuddår"
        Nei -> print "er ikke et skuddår"
6. Slutt
  */    
public class Skuddår {    

        //Setter opp testdata med tilfeldige år.
    public static void main(String[] args) {
        int [] testavdivår = {2024, 2025, 1997, 2000, 1814, 1900, 1984};
        
        for (int i = 0; i < testavdivår.length; i++){
            int år = testavdivår[i];
            if (erSkuddår(år)) {
            System.out.println(år + " er et skuddår");
            } else {
            System.out.println(år + " er ikke et skuddår");
            }
        }
    } 
    public static boolean erSkuddår(int år) {
        if (år % 400 == 0) {
        return true;
        } else if (år % 100 == 0) {
        return false;
        } else {
        return år % 4 == 0;
        }
    }
}    


    
