public class Tekstanalyse {
    private int[] antallTegn = new int[30];

    public Tekstanalyse(String tekst) {
        tekst = tekst.toLowerCase();
        for (int i = 0; i < tekst.length(); i++) {
            char tegn = tekst.charAt(i);
            if (tegn >= 'a' && tegn <= 'z') {
                antallTegn[tegn - 'a']++;
            } else if (tegn == 'æ') {
                antallTegn[26]++;
            } else if (tegn == 'ø') {
                antallTegn[27]++;
            } else if (tegn == 'å') {
                antallTegn[28]++;
            } else {
                antallTegn[29]++;
            }
        }
    }

    public int AntallForskjelligeBokstaver() {
        int antall = 0;
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > 0) {
                antall++;
            }
        }
        return antall;
    }

    public int TotaltAntallBokstaver() {
        int sum = 0;
        for (int i = 0; i < 29; i++) {
            sum += antallTegn[i];
        }
        return sum;
    }

    public double ProsentIkkeBokstaver() {
        int total = TotaltAntallBokstaver() + antallTegn[29];
        if (total == 0) return 0;
        return (antallTegn[29] * 100.0) / total;
    }

    public int AntallAv(char bokstav) {
        bokstav = Character.toLowerCase(bokstav);
        if (bokstav >= 'a' && bokstav <= 'z') {
            return antallTegn[bokstav - 'a'];
        } else if (bokstav == 'æ') return antallTegn[26];
        else if (bokstav == 'ø') return antallTegn[27];
        else if (bokstav == 'å') return antallTegn[28];
        else return -1; // Ikke en bokstav
    }

    public String VanligsteBokstaver() {
        int maks = 0;
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > maks) {
                maks = antallTegn[i];
            }
        }

        StringBuilder vanligste = new StringBuilder();
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] == maks) {
                char bokstav;
                if (i < 26) bokstav = (char) ('a' + i);
                else if (i == 26) bokstav = 'æ';
                else if (i == 27) bokstav = 'ø';
                else bokstav = 'å';
                vanligste.append(bokstav).append(" ");
            }
        }
        return vanligste.toString().trim();
    }
}
