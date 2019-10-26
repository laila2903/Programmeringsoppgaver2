public class MyndighetFørerkort {

    public static void main(String[] args) {
        String innAlder = "Skriv inn alderen din: ";
        int alder = Integer.parseInt(innAlder);

        if (alder < 18){
            System.out.println("Du er for ung til å ta førerkort for bil");
        }

        if (alder >= 18 && alder <70){
            System.out.println("Du kan ta førerkortet for bil g du trenger ikke årlige legesjekker ");
        }

        if (alder >= 70){
            System.out.println("Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker");
        }

        /*if (alder < 18){
            System.out.println("Du er for ung til å ta førerkort for bil");
        }
        else {
            System.out.println("Du kan ta førerkortet for bil da du er gammel nok");
        }*/


    }
}
