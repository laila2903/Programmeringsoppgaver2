class Kjøretøy {

    /**
     * Lag en klasse Kjøretøy som er super-klassen til Bil og Motorsykkel.
     * Motorsykkelklassen skal ha de samme attributtene som Bil-klassen i refererte oppgave (typebetegnelse, førstegangsregisterering og kjennetegn).
     * Bil-klassen skal i dette tilfellet ha en ny attributt : lastekapasitet (i kg).
     * Skriv om koden for "Register for Motorvogn" for å implementere det overstående. Husk å bruke polyformisme ved å opprette arrayet med typen "Kjøretøy".
     */

    private String type;
    private Dato frgangreg;
    private String skiltnr;

    public Kjøretøy(String type, Dato frgangreg, String skiltnr) {
        this.type = type;
        this.frgangreg = frgangreg;
        this.skiltnr = skiltnr;
    }

    public String getType() {
        return type;
    }

    public String getSkiltnr() {
        return skiltnr;
    }

    public Dato frgangreg() {
        return frgangreg;
    }
}

    class Motorsykkel extends Kjøretøy {

        public Motorsykkel (String type, Dato frgangreg, String skiltnr){
            super(type,frgangreg,skiltnr);
        }

        @Override
        public String toString(){
            return "Motorsykkeltypen er: "+this.getType()+"\n"+"Motorsykkel med skiltnummer: "+this.getSkiltnr()+" er førstgangsregistrert "+this.frgangreg();
        }

    }

    class Bil extends Kjøretøy{

        double lastekapasitet;

        public Bil (String type, Dato frgangreg, String skiltnr, double lastekapasitet) {
            super(type,frgangreg,skiltnr);
            this.lastekapasitet = lastekapasitet;
        }

        @Override
        public String toString(){
            return "Biltypen er: "+this.getType()+"\n"+"Bil med skiltnummer: "+this.getSkiltnr()+" er førstgangsregistrert "+this.frgangreg();
        }

    }

    class Dato {
        private int dag, måned, år;

        public Dato( int dag, int måned, int år ) {
            this.dag = dag;
            this.måned = måned;
            this.år =år;
        }

        private static String månedsnavn( int mnd ) {
            String[] navn = { "januar", "februar", "mars", "april", "mai",
                    "juni", "juli", "august", "september", "oktober", "november",
                    "desember" };
            if ( mnd > 0 && mnd < 13 )
                return navn[ mnd - 1 ];
            else
                return "ukjent måned";
        }

        @Override
        public String toString(){
            return this.dag+"/"+this.måned+"/"+this.år;
        }
    }

    public class arvmotorvogn {

    public static void main(String[] args) {
        //Skriv om koden for "Register for Motorvogn" for å implementere det overstående. Husk å bruke polyformisme ved å opprette arrayet med typen "Kjøretøy".

        Kjøretøy [] kjøretøy = new Kjøretøy[10];

        Dato dato1 = new Dato(1,3,2015);
        Dato dato2 = new Dato(4,10,2016);
        Dato dato3 = new Dato(5,11,2017);
        Dato dato4 = new Dato(6,12,2018);
        Dato dato5 = new Dato(7,1,2019);
        Dato dato6 = new Dato(8,2,2019);


        Motorsykkel motor1 = new Motorsykkel("Dukati",dato1,"DK445333");
        Motorsykkel motor2 = new Motorsykkel("Suzuki",dato2,"DB111113");
        Motorsykkel motor3 = new Motorsykkel("Loloz",dato3,"JL333333");
        Bil bil1 = new Bil("Volvo",dato4,"DB44556",3500);
        Bil bil2 = new Bil("Audi",dato5,"RP44564",6500);
        Bil bil3 = new Bil("Volkswagen",dato6,"HÆ335543",4000);

        kjøretøy [0] = motor1;
        kjøretøy [1] = motor2;
        kjøretøy [2] = motor3;
        kjøretøy [3] = bil1;
        kjøretøy [4] = bil2;
        kjøretøy [5] = bil3;

        // List motorvognregisteret (arrayet) ved hjelp av en løkke

        for (Kjøretøy enkjøretøy : kjøretøy){
            System.out.println(enkjøretøy);
            System.out.println("-------");
        }


    }


}
