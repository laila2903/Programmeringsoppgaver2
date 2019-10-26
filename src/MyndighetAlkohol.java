import javax.swing.*;

public class MyndighetAlkohol {

    public static void main(String[] args) {
        String innAlder = JOptionPane.showInputDialog("Skriv inn din alder her: ");
        int alder = Integer.parseInt(innAlder);

        if (alder < 18){
            String ut = "Du er ikke myndig!";
            JOptionPane.showMessageDialog(null,ut);
        }

        if (alder >= 18 && alder <20){
            String ut = "Du er myndig men kan ikke kjøpe alkohol med mer enn 22 % på polet";
            JOptionPane.showMessageDialog(null,ut);
        }

        if(alder >= 20){
            String ut = "Du kjøpe hva du vil på polet";
            JOptionPane.showMessageDialog(null,ut);
        }

    }

}
