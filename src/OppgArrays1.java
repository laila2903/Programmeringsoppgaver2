public class OppgArrays1 {

    public static void main(String[] args) {

        /**
         * Bruk arrayet i oppgave 1. Summer alle tallene med en for-løkke.
         * Finn så gjennomsnittet av alle tallene. Summer så alle tallene som er større enn 5.
         * Finn så gjennomsnittet av disse. Summer så tallene med en forenklet for-løkke.
         */

        int a [] = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int i = 0; i<a.length; i++){
            sum = sum + i;
        }
        //System.out.println("summen av alle tallene i array a er: "+sum);
        double gjennomsnitt = sum/a.length;
       // System.out.println("Gjennomsnittet av alle tallene er: "+gjennomsnitt);


        sum=0;
        int teller = 0;
        for (int i : a){
            if (i > 5){
                sum += i;
                teller++;
            }
        }
        //System.out.println("Summen av tallene over 5 i listen er "+sum);
        gjennomsnitt = (double)sum/teller;
       // System.out.println("Gjennomsnittet er av de samme tallene er "+gjennomsnitt);

        /**
         * Gitt følgende string-array : Per, Hansen, Line, Olsen, Ola, Pedersen, Kari, Finnsen.
         * Skriv så ut for og etternavn på flere linjer med en løkke som vist under:
         * Per Hansen
         * Line Olsen
         */

        String [] navn = {"Per","Hansen","Line","Olsen","Ola","Pedersen","Kari","Finnsen"};

        for (int i = 0; i <navn.length-1; i+=2){
            String fornavn = navn[i];
            String etternavn = navn[i+1];
           // System.out.println(fornavn+" "+etternavn);
        }

        /**
         * Definer følgende heltallsarray : 45, 34, 5, 8, 10, 2, 13, 25. Lag et program som skriver ut tallene baklengs.
         * (Dvs. 25, 13, 2 osv.) med en for-løkke.
         * Tips: Start fra array.length - 1 så lenge telleren i for-løkka er større eller lik 0.
         * Mink telleren med en hver gang.
         */

        /**
         * Bruk arrayet i oppgave 4 og skriv kode for å finne det største og minste tallet i arrayet via en løkke.
         * Tips: Sett største og minste tallet til første elementet i arrayet før løkken.
         */

        int [] b = {45,34,5,8,10,3,13,25,45};


        /*for (int i = b.length-1; i >= 0; i--){
            System.out.println(b[i]);
        }*/

        int maks = b[0];
        int min = b[0];
        for (int i = 0; i <b.length-1; i++){
            if (i>maks){
                maks = b [i];
            }
            if (i<min){
                min = b [i];
            }
        }
        //System.out.println("Maks verdien i arrayet er: "+maks);
        //System.out.println("Min verdien i arrayet er: "+min);

        /**
         * Lag et program som sjekker om to heltalls-arrays er like. Bruk løkker, ikke innebygd java klasse/metode.
         */


        int [] liste = {45, 34, 5, 8, 10, 2, 13, 25};
        int [] liste1 = {45, 34, 5, 8, 10, 2, 13, 25};
        if (liste.length != liste1.length){
            System.out.println("Arrayene er ikke like! De har forskjellig lengde!");
        }
        else{
            boolean like = true;
            for (int i = 0; i < liste.length; i++){
                if(liste[i] != liste1[i]){
                    like = false;
                }
            }
            if(like){
                System.out.println("Arrayene er like");
            }
            else{
                System.out.println("Arrayene er like lange, men har forskjellige elementer");
            }
        }

       // Lag et program som teller opp antall partall og antall oddetall i et helttalls-array.

       int [] c = {2,3,5,7,8,45,6,13,14};
        int tellerOdd = 0;
        int tellerPar = 0;
        for (int i=0; i<c.length; i++){
            if(c[i]%2==0){
                tellerPar++;
            }
            if(c[i]%2!=0){
                tellerOdd++;
            }
        }
        System.out.println("antall partall er: "+tellerPar+" antall oddetall er: "+tellerOdd);


    }

}
