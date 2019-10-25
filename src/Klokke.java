import javax.swing.*;

public class Klokke {

    private int time;
    private int minutter;
    private int sekunder;

    public Klokke (int time, int minutter, int sekunder){
        this.time = time;
        this.minutter = minutter;
        this.sekunder = sekunder;
    }

    public void setTime (int time){
        if(time >= 0 && time <= 24){
            this.time = time;
        }

    }

    public int getTime(){
        return time;
    }

    public void setMinutter(int minutter){
        if(minutter>=0 && minutter <=59){
            this.minutter = minutter;
        }
    }

    public int getMinutter(){
        return minutter;
    }

    public void setSekunder(int sekunder){
        if(sekunder >= 0 && sekunder <= 59){
            this.sekunder = sekunder;
        }
    }

    public int getSekunder(){
        return sekunder;
    }

    public void visTiden (){
        String ut = getTime()+":"+getMinutter()+":"+getSekunder();
        JOptionPane.showMessageDialog(null,ut);
    }

    public static void main (String [] args){
        Klokke klokke1 = new Klokke(23,45,30);
        klokke1.visTiden();
    }
}
