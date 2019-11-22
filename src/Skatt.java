public class Skatt {

    private String navn;
    private String adresse;
    private double lønn;
    private double skatt;

    public Skatt (String navn, String adresse, double lønn){
        this.navn = navn;
        this.adresse = adresse;
        this.lønn = lønn;
    }

    public void beregn(){
        if(lønn<50000){
            skatt = 0;
        }
        else if (50000<lønn && lønn<150000){
            skatt = 0.25*lønn;
        }
        else {
            skatt = 0.35 * lønn;
        }
    }

    public String toString (){
        String ut = navn +", "+adresse+"\n"+"Lønn: "+lønn+" Skatt: "+skatt;
        return ut;
    }

    public static void main(String[] args) {
        Skatt person1 = new Skatt("Laila Doudouh","Huttiheita 3456 Oslo",66453783);
        person1.beregn();
        System.out.println(person1);
    }

}
