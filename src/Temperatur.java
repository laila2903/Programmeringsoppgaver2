public class Temperatur {

    public static double gjennomsnitt (double [] a){

        int teller = 0;
        double sum = 0;
        for (int i = 0; i<a.length; i++){
            sum = sum + a[i];
            teller++;
        }
        double gjennomsnitt = sum/teller;
        return gjennomsnitt;
    }

    public static double minimum (double [] a){
        double min = a[0];

        for (int i = 0; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        double [] a = {-0.4, -2.9, -2.8, -3.8, 1.6, -2.4, -0.9, -2.2, 0.5, -4.0};

        System.out.println(gjennomsnitt(a));
        System.out.println(minimum(a));

    }

}
