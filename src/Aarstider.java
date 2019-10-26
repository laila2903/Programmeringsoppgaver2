import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Aarstider {

    public static void main(String[] args) {
        String måned = showInputDialog("Angi måned (f.eks mars)?");
        if(måned.equals("juni") || måned.equals("juli") || måned.equals("august")){
            showMessageDialog(null, "Det er sommer");
        }
        else if(måned.equals("september") || måned.equals("oktober") || måned.equals("november")){
            showMessageDialog(null, "Det er høst");
        }
        else if(måned.equals("desember") || måned.equals("januar") || måned.equals("februar")){
            showMessageDialog(null, "Det er vinter");
        }
        else if(måned.equals("mars") || måned.equals("april") || måned.equals("mai")){
            showMessageDialog(null, "Det er vår");
        }
        else {
            showMessageDialog(null, "Det er ikke en gyldig måned!");
        }

       // String måned = showInputDialog("Angi måned (f.eks mars)?");
        switch(måned){
            case "juni":
            case "juli":
            case "august":
                showMessageDialog(null, "Det er sommer");
                break;
            case "september":
            case "oktober":
            case "november":
                showMessageDialog(null, "Det er høst");
                break;
            case "desemner":
            case "januar":
            case "februar":
                showMessageDialog(null, "Det er vinter");
                break;
            case "mars":
            case "april":
            case "mai":
                showMessageDialog(null, "Det er vår");
                break;
            default:
                showMessageDialog(null, "Feil input, ikke gyldig månedsnavn!");
                break;
        }

    }
}
