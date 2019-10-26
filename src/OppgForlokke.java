public class OppgForlokke {



    public static void main(String[] args) {

        /*for (int i = 0; i < 10; i++){
            int sum = i + i;
            if( sum <10){
               //System.out.println(sum);
            }
        }

        /*int sum = 0;
        for (int i = 0; i<10; i++){
            sum +=1;
            System.out.println(sum);
        }     */


        /*int par = 0;
        for (int i = 0; i < 20; i+=2){
              //System.out.println(" Partall mellom 0 og 20 er: "+i);
        }*/

        int sum = 0;
        int teller = 0;
        for (int i = 0; i < 100; i+=2){
            sum = sum + i;
            teller++;
        }
        System.out.println(sum);

        double gjennomsnitt = sum/teller;
        System.out.println(gjennomsnitt);




    }

}
