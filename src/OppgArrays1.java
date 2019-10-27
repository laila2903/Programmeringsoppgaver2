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

        for (int i = 0; i <a.length-1; i+=2){
            String fornavn = navn[i];
            String etternavn = navn[i+1];
            System.out.println(fornavn+" "+etternavn);
        }

    }

}
