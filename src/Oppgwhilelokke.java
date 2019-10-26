public class Oppgwhilelokke {

    public static void main(String[] args) {

       /* int i = 0;
        while (i<10){
           System.out.println(i);
            i++;
        }*/

       /* int i = 0;
        int sum = 0;
        while (i<10){
            sum = sum+i;
            i++;
        }
        System.out.println("summen av alle tall mellom 0 og 9 er: "+sum);*/

        /*int i = 0;
        while (i<20){
            System.out.println(i);
            i+=2;
        }*/

        int i = 0;
        int sum = 0;
        int teller = 0;
        while (i<100){
            sum = sum+i;
            i++;
            teller++;
        }
        System.out.println("summen av alle tall mellom 0 og 100 er: "+sum);
        double gjennomsnitt = sum/teller;
        System.out.println("Gjennomsnittet av alle tall mellom 0 og 100 er: "+gjennomsnitt);




    }

}
