import static javax.swing.JOptionPane.*;

class UnikeTall {

    // Legger av plass for vårt array
    private int[] tabell;

    /* Konstruktør som mottar arrayens lengde som parameter og
      oppretter arrayen.  */
    public UnikeTall(int lengde) {
        tabell = new int[lengde];

        // Velger å fylle arrayet med tilfeldige tall rett i konstruktøren
        fyllArrayMedTilfeldigeTall();
    }

    private boolean finnesIArray(int tall) {
        for(int i = 0; i < tabell.length; i++) {
            // Hvis tabellverdien er lik tallet vi leter etter
            // Kan vi returnere true her og for løkken vil avsluttes
            if(tabell[i] == tall) {
                return true;
            }
        }
        // Ingen av verdiene i tabellen er lik 'tall', da returnerer vi false.
        return false;
    }

    private void fyllArrayMedTilfeldigeTall() {
        int i = 0;
        while(i < tabell.length) {
            // Trekker et tilfeldig tall mellom 100 og 999 (grensene inkluderte)
            int tilfeldigTall = (int)(Math.random() * 900 + 100);

            // Sjekker om tallet vårt IKKE finnes i arrayet vårt, merk ! betyr false
            if(!finnesIArray(tilfeldigTall)) {
                // Legger den tilfeldige verdien i arrayet vårt
                tabell[i] = tilfeldigTall;
                // Hvis den ikke finnes allerede, da skal vi gå til neste indeks i arrayet vårt.
                i++;
            }
            // Hvis den finnes i arrayet, vil while løkka sørge for at vi trekker et nytt tall for samme indeks
        }
    }

    // Metode som finner og returnerer det minste tallet i arrayen.
    private int minst() {
        int minstVerdi = tabell[0];

        for(int i = 1; i < tabell.length; i++) {
            // Sjekker om verdien er mindre enn minstVerdi
            if(tabell[i] < minstVerdi) {
                minstVerdi = tabell[i];
            }
        }
        return minstVerdi;
    }

    // Metode som finner og returnerer det største tallet i arrayen.
    private int storst() {
        int storstVerdi = tabell[0];

        for(int i = 1; i < tabell.length; i++) {
            // Sjekker om verdien er større enn storsteVerdi
            if(tabell[i] > storstVerdi) {
                storstVerdi = tabell[i];
            }
        }
        return storstVerdi;
    }

    /*  Metode som beregner og returnerer den gjennomstnittlige verdien
      (double-verdi) av tallene i arrayen.  */
    private double gjennomsnitt() {
        double sum = 0;
        for(int value: tabell) {
            sum+= value;
        }
        return sum / tabell.length;
    }

    public void visInformasjon() {
        String utMelding = "";

        for(int i = 0; i < tabell.length; i++) {
            utMelding += tabell[i] + " ";

            // Linjeskift hvert 8ende tall.
            // i + 1 gjør at vi unngår å få linjeskift når i er 0 fordi 0 % 8 = 0
            if((i + 1) % 8 == 0) {
                utMelding += "\n";
            }
        }
        // Legger til et par ekstra linjeskift etter tallene
        utMelding += "\n\n";

        utMelding += "Minste tall er " + minst() + "\n"
                + "Største tall er " + storst() + "\n"
                + "Gjennomsnittsverdien er " + String.format("%.2f",gjennomsnitt()) + "\n";
        showMessageDialog(null, utMelding);
    }

    public static void main(String[] args) {
        UnikeTall tall = new UnikeTall(65);
        tall.visInformasjon();
    }

}


