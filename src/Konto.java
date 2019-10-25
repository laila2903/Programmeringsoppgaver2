public class Konto {

    private String navn;
    private String kontonummer;
    private int saldo;

    public Konto (String navn, String kontonummer, int saldo){
        this.navn = navn;
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setKontonummer(String kontonummer) {
        this.kontonummer = kontonummer;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void kontoUtskrift(){
        String ut = "Kontoinnhaver: "+getNavn()+"\n"+"Kontonummer: "+getKontonummer()+"\n"+"Saldo: "+getSaldo();
        System.out.println(ut);
    }

    public void innPåKonto(int innskudd){
        int nySaldo = getSaldo() + innskudd;
        String ut = "Den nye saldoen etter innskudd er: "+nySaldo;
        System.out.println(ut);
    }

    public void UtAvKonto (int utttak ){
        if (utttak>= 0 && utttak<=saldo){
        int nySaldo = getSaldo() - utttak;
        String ut = "Den nye saldoen etter uttak er: "+nySaldo;
        System.out.println(ut);
        }
        else {
            String ut = "Ikke nok dekning";
            System.out.println(ut);
        }

    }

    public static void main(String[] args) {
        Konto konto1 = new Konto("Laila","664435677864",45);
        konto1.kontoUtskrift();
        konto1.innPåKonto(10);
        konto1.UtAvKonto(100);
    }

}
