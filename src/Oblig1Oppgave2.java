import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

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
        if(antall>0) {
            this.antall=antall;
        }
    }

    public void setPris(double pris){
        if(pris>0) {
            this.pris = pris;
        }
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

    public double totalpris (){
        return pris*antall;
    }
}

public class Oblig1Oppgave2 {

    public static void main(String[] args){
        // les inn navn, antall og pris for vare 1
        // les inn navn, antall og pris for vare 2
        // bruk avvikshåntering (try/catch) for å konvertere
        // antall og pris for vare 1 og vare 2
        // opprett to vare-objekter med de innleste verdiene
        // beregn og skriv ut total pris for alle varer i System.out

        String vare1Navn = showInputDialog("Skriv inn navnet på vare nr 1: ");
        String innVare1Antall = showInputDialog("Skriv inn antall varer til vare nr 1: ");
        String innVare1Pris = showInputDialog("Skriv inn prisen til vare nr 1: ");

        String vare2Navn = showInputDialog("Skriv inn navnet på vare nr 2: ");
        String innVare2Antall = showInputDialog("Skriv inn antall varer til vare nr 2: ");
        String innVare2Pris = showInputDialog("Skriv inn prisen til vare nr 2: ");

        int vare1Antall, vare2Antall;
        double vare1Pris, vare2Pris;
        try{
            vare1Antall = Integer.parseInt(innVare1Antall);
            vare1Pris = Double.parseDouble(innVare1Pris);
        }
        catch(Exception e){
            vare1Antall=0;
            vare1Pris=0;
            showMessageDialog(null,"Feil i antall eller pris");
        }
        try{
            vare2Antall = Integer.parseInt(innVare2Antall);
            vare2Pris = Double.parseDouble(innVare2Pris);
        }
        catch(Exception e){
            vare2Antall=0;
            vare2Pris=0;
            showMessageDialog(null,"Feil i antall eller pris");
        }

        // Opprett to varer

        Vare vare1 = new Vare(vare1Navn,vare1Antall,vare1Pris);
        Vare vare2 = new Vare(vare2Navn,vare2Antall,vare2Pris);

        // Regn ut totalprisen på alle varer

        double sum = vare1.totalpris()+vare2.totalpris();

        System.out.println("Totalprisen ble : "+sum+" kr");
    }
}