public class oblig2oppgaver {

    /**
     * Lag et program som beregner og skriver ut summen av alle tall mellom to grenser som brukeren skriver inn.
     * Programmet skal starte med å lese inn nedre og øvre grense for summen. Dersom innlest øvre grense er mindre enn eller
     * lik nedre grense, skal programmet skrive ut en melding til brukeren om dette og foreta ny innlesing. Når godkjente
     * grenser er lest inn, skal programmet beregne nevnte sum og summen skal så skrive den ut som en sum. Hvis f. eks.
     * nedre grense er 2 og øvre grense er 8 skal det skrives ut følgende tekst: "2 + 3 + 4 + 5 + 6 + 7 + 8 = 35".
     * Test ut programmet med nedre grense lik 1 og øvre grense lik 100. Legg inn et linjeskift for hvert 10. tall i summen.
     * @return
     */

   public static String sumMedGrenser (int nedregrense, int øvregrense){

       int sum = 0;
       try {
           for (int i = nedregrense; i < øvregrense; i++){
               sum = sum + i;
               System.out.print(i + " + ");
           }
           sum += øvregrense;
           String ut = øvregrense+ " = " + sum;
       } catch (Exception e) {
           if (øvregrense<=nedregrense){
               throw new ArrayIndexOutOfBoundsException("en inntastede øvregrense kan ikke være mindre elle lik nedregrensen!");
           }
       }
       String ut = øvregrense+ " = " + sum;
       return ut;
   }



    public static void main(String[] args) {

        System.out.println(sumMedGrenser(2,8));



    }

}
