class Sirkel {

    // Statisk metode som beregner og returnerer sirkelens diameter.

        public static double diameter (double radius){
            double diameter = radius*2;
            return diameter;
        }

    // Statisk metode som beregner og returnerer sirkelens omkrets.
    // Omkrets = 2*pi*r

    public static double omkrets (double radius){
            double omkrets = 2*Math.PI*radius;
            return omkrets;
    }

    /* Statisk metode som beregner og returnerer sirkelens areal.
       Areal = pi*r^2
       Math.PI kan brukes for en konstant for PI
       Math.pow kan brukes for å opphøye et tall i en potens
     */

    public static double areal (double radius){
        double areal = Math.PI*Math.pow(radius,2);
        return areal;
    }
}

public class Oblig1Oppgave1 {

    public static void main(String[] args) {
        //  Sett en variabel lik en verdi for radius
       double radius = 23.5;

    /* Kall så de statiske metodene i sirkel-klassen for å vise følgende på
       System.out (gitt radius lik 23.5)

       Arealet av sirkelen med radius 23.5 er 1734,94
       Omkretsen av sirkelen med radius 23.5 er 147,65
       Diameteren til sirkelen er med radius 23.5 er 47,00

       Tips : String.format("%.2f",desimalverdi); for å formatere to desimaler
    */

        System.out.println(Sirkel.areal(radius));
        System.out.println(Sirkel.diameter(radius));
        System.out.println(Sirkel.omkrets(radius));



    }
}
