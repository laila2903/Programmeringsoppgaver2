import java.util.Arrays;

public class Liste {

   //Opggave 3

    //1)
    public static int positiv (int [] a){

        int teller = 0;
        for (int i = 0; i<a.length; i++){
            if(a[i]>0){
                teller++;
            }
        }
        return teller;
    }

    //2)

    public static int forekomst (int [] a, int verdi){

        int teller = 0;
        for(int i= 0; i<a.length; i++){
            if(a[i]==verdi){
                teller++;
            }
        }
        return teller;
    }

    public static int max (int [] a){
        int max = a[0];
        for(int i = 0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }


    public static void main (String [] arg){
        int [] a = {1,3,-4,-5,2,3,5};
        System.out.println(positiv(a));
        System.out.println(forekomst(a,3));
        System.out.println(max(a));

    }

}
