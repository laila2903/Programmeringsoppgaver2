import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OppgArrays2 {
    /**
     * Definer følgende helttalls-ArrayList: 1,2,3,4,5,6,7,8,9.
     * Skriv ut element nummer 3 og 6 med System.out
     */

    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        /*
        for (int i = 1; i <10 ;i++){
            liste.add(i);
        }

        System.out.println("Element nummer 3 er "+liste.get(2));
        System.out.println("Element nummer 6 er "+liste.get(5));
*/

        /**
         * Bruk samme array som i oppgave 1. Legg til tallene 10 og 11 i arrayet.
         * Slett så elementene med tallene 2 og 3. Skriv så ut hele arrayet med en for-løkke.
         * Bruk size() for å finne lengden i arrayet.
         */

        for (int i = 1; i <10 ;i++){
            liste.add(i);
        }

        liste.add(10);
        liste.add(11);

        int indeks = liste.indexOf(2); //fjerner 2
        int indeks1 = liste.indexOf(2); //må ta indeks of 2 igjen da den nye posisjon til 3 eter forrige fjerning er 2

        liste.remove(indeks);
        liste.remove(indeks1);

        for(int tall : liste){
           // System.out.print(tall+" ");
        }
       // System.out.println("Størrelsen på arraylisten er: "+liste.size());

        /**
         * Definer et heltalls-arrayet  : 1,2,3,4,5,6,7,8,9.
         * Skriv kode for å konvertere dette til et ArrayList. Skriv så ut denne ArrayListen.
         */

        int [] a = {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> liste1 = new ArrayList<>();

        for(int i : a){
            liste1.add(i);
        }

        for(int i : liste1){
           // System.out.print(i+" ");
        }

        /**
         * Definer et ArrayList attay : 1,2,3,4,5,6,7,8,9.
         * Skriv kode for å konvertere dette til et vanlig heltalls-array.
         * Skriv så kode for å skrive ut det nye heltalls-arrayet
         */

        ArrayList <Integer> liste2 = new ArrayList<>();

        for(int i = 1; i < 10; i++){  //legge til og definere arraylisten liste 2
            liste2.add(i);
            //System.out.print(i+" ");
        }

        int [] d = new int[liste2.size()]; //definere størrelsen på array d "fixed lengde" på den

        for (int i = 0; i <liste2.size(); i++){  //sette hvert element i de til å være en kopi av hvert elemt i liste2
            d[i]=liste2.get(i);
        }

        for(int i : d){
          //  System.out.print(i+" ");
        }

        /**
         * Det er definert et to-dimensjonalt helttalls-array (se under). Hver rad tilsvarer en filmanmelders "score" av 4 filmer (kolonner).
         *
         * 4	6	2	5
         * 7	9	4	8
         * 6	9	3	7
         * Lag et program som beregner gjennomsnittlig "score" for de 4 forskjellige filmene og skriver ut resultatet.
         */

        int film [] [] ={{4,6,2,5},{7,9,4,8},{6,9,3,7}};


        for (int i = 0; i < 4; i++){
            double kolSum = 0;
            double gjsnitt = 0;
            int teller = 0;
            for (int j=0; j < 3; j++){
                kolSum += film[j][i];
                teller++;
            }

            gjsnitt = kolSum/teller;

            System.out.println(i + " column average: " + gjsnitt);
        }



        /**
         * Utvid oppgave 6 til også å lese inn matrisen (det to-dimensjonale arrayet) fra brukeren.
         * Først skal man kunne lese inn antall anmeldere (rader) og antall filmer (kolonner).
         * Så skal arrayet defineres og man skal lese inn "scores".
         * Bruk gjerne try/catch for å sikre at man leser inn korrekte tall.
         * Sjekk også om tallene er mellom 0 og 9.
         */




    }
}
