//Klassen
public class Student {
    private String navn;
    private int antallOppg;

//Konstruktør
    public Student(String navn, int antallOppg){
        this.navn = navn;
        this.antallOppg = antallOppg;
    }

//Get-metoder    
    public String getNavn(){
        return navn;
    }
    public int getAntallOppg(){
        return antallOppg;
    }

//Endringsmetode + sjekker at økning er positiv    
    public void økAntallOppg(int økning) {
        if (økning > 0) {
            antallOppg += økning;
        }
    }
    
    @Override
    public String toString() {
        return navn + " har fått godkjent " + antallOppg + " oppgaver.";
    }
}
