class Vare {
    private String navn;
    private int antall;
    private double pris;

    // Konstruktør med alle attributter

    public Vare (String navn, int antall, double pris){
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    // get / set metoder

    public void setNavn(String navn){
        this.navn = navn;
    }

    public void setAntall(int antall){
        this.antall = antall;
    }

    public void setPris(double pris){
        this.pris = pris;
    }

    public String getNavn(){
        return navn;
    }

    public int getAntall() {
        return antall;
    }

    public double getPris() {
        return pris;
    }

    // antall og pris må være større enn null



    // metode for å beregne totalpris (pris * antall)
}

public class Oblig1Oppgave2 {

    public static void main(String[] args){
        // les inn navn, antall og pris for vare 1

        // les inn navn, antall og pris for vare 2

        // bruk avvikshåntering (try/catch) for å konvertere
        // antall og pris for vare 1 og vare 2

        // opprett to vare-objekter med de innleste verdiene

        // beregn og skriv ut total pris for alle varer i System.out
    }
}