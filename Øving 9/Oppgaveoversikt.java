//Klassen
public class Oppgaveoversikt { 
    private Student[] studenter;
    private int antStud;

//Konstruktør, = 0 fordi ingen er registrert enda.
    public Oppgaveoversikt(int maksAntall) {
        studenter = new Student [maksAntall];
        antStud = 0;
    }

//Returner hvor mange som er registrert
    public int AntStudenter() {
        return antStud;
    }

//Søk gjennom registrerte studenter. Returnerer -1 dersom ingen med oppsøkt navn finnes.
    public int AntOppgaver(String navn) {
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equalsIgnoreCase(navn)) {
                return studenter[i].getAntallOppg();
            }
        }
        return -1;
    }

//Registrer ny student
    public void registrerStudent(String navn, int antallOppg) {
        if (antStud < studenter.length) {
            studenter[antStud] = new Student(navn, antallOppg);
            antStud++;
        }
    }

//Øker antall oppgaver, økning skjer dersom verdi er høyere enn gammel verdi
    public void økAntallOppg(String navn, int økning) {
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equalsIgnoreCase(navn)) {
                studenter[i].økAntallOppg(økning);
            }
        }
    }

//Tekstlig oversikt med stringbuilder (for å legge til, endre, fjerne tekst uten å lage nye objekter) 
    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder("Totalt antall oppgaver: 10 \n");
    sb.append("Antall registrerte studenter: ").append(antStud).append("\n\n");
    
    for (int i = 0; i < antStud; i++) {
        sb.append(studenter[i].toString()).append("\n");
    }
    return sb.toString();
    }
}

