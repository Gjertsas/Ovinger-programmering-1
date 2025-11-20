/* Lag en klasse Person med attributter fornavn, etternavn og fødselsår. Klassen skal ha en get
metode for hvert attributt og være immutabel. */

//Klasse med attributter som ikke kan endres (final)
public class Person {
    private final String fornavn;
    private final String etternavn;
    private final int fødselsår;

//Konstruktør    
    public Person(String fornavn, String etternavn, int fødselsår){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fødselsår = fødselsår;
    }

//Get-metoder    
    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public int getFødselsår() {
        return fødselsår;
    }
    
//Override for mer meningsfull tekst    
    @Override
    public String toString() {
        return etternavn + ", " + fornavn;
    }
}

