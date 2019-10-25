import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Vind {

    private double vindHastighet = 0.0;

    public Vind (double vindHastighet){
        this.vindHastighet = vindHastighet;
    }
    public double getVindHastighet(){
        return vindHastighet;
    }

    public boolean erOrkan(){
        if(vindHastighet >= 120){
            return true;
        }
        else return false;
    }

    public boolean erVindstille(){
        if (2 >= vindHastighet){
          return true;
        }
        else return false;
    }

    public double getKnop(){
        double knop = vindHastighet/1.852;
        return knop;
    }

    public double getBeaufort(){
        double beafort = Math.pow((vindHastighet/3.01),0.6666)+0.5;
        if(beafort>12){
            beafort=12;
        }
        return beafort;
    }

    public static void main(String[] args) {
        String innVind = showInputDialog("Oppgi vindhastigheten");
        double vind = Double.parseDouble(innVind);
        Vind sjekkVind = new Vind(vind);
        String ut = "Vindhastigheten er "+sjekkVind.getVindHastighet()+"\n";
        if (sjekkVind.erOrkan()){
            ut+="Det er orkan!\n";
        }
        if(sjekkVind.erVindstille()){
            ut+="Det er stille\n";
        }
        String knop = String.format("%.2f", sjekkVind.getKnop());
        ut+="Det er "+knop+" knop\n";
        ut+="Og det tilsvarer "+sjekkVind.getBeaufort()+" på beaufort skalaen!";
        showMessageDialog(null, ut);

    }
}
