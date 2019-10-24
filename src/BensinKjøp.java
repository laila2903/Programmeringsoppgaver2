import javax.swing.*;

public class BensinKjøp {

    private String Bensinstasjonsted;
    private String bensintype;
    private double antallLiter;
    private double prisprliter;
    private String tidspunktfylt;

    public BensinKjøp (String Bensinstasjonsted, String bensintype, double antallLiter, double prisprliter, String tidspunktfylt){
        this.Bensinstasjonsted = Bensinstasjonsted;
        this.bensintype = bensintype;
        this.antallLiter = antallLiter;
        this.prisprliter = prisprliter;
        this.tidspunktfylt = tidspunktfylt;
    }

    public void setBensinstasjonsted (String Bensinstasjonsted){
        this.Bensinstasjonsted = Bensinstasjonsted;
    }

    public String getBensinstasjonsted (){
        return Bensinstasjonsted;
    }

    public void setBensintype(String bensintype) {
        this.bensintype = bensintype;
    }

    public String getBensintype() {
        return bensintype;
    }

    public void setAntallLiter(double antallLiter){
        this.antallLiter = antallLiter;
    }

    public double getAntallLiter(){
        return antallLiter;
    }

    public void setPrisprliter(double prisprliter){
        this.prisprliter = prisprliter;
    }

    public double getPrisprliter(){
        return prisprliter;
    }

    public void setTidspunktfylt(String tidspunktfylt){
        this.tidspunktfylt = tidspunktfylt;
    }

    public String getTidspunktfylt(){
        return tidspunktfylt;
    }

    public double finnTotalPrisen (){
        double prisen = getAntallLiter()*getPrisprliter();
        String.format("%.2f",prisen);
        return prisen;
    }

    public static void main(String[] args) {
        BensinKjøp etKjøp = new BensinKjøp("Asker", "95", 49, 17.10, "10:30");
        double pris = etKjøp.finnTotalPrisen();
        String prisToDesimaler = String.format("%.2f", pris);
        String ut = "Det kostet totalt "+prisToDesimaler+" kr i "+etKjøp.getBensinstasjonsted()+
                " kl "+etKjøp.getTidspunktfylt();
        System.out.println(ut);

    }
}
