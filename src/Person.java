import javax.swing.*;

public class Person {

    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnr;

    public Person (String fornavn, String etternavn, String adresse, String telefonnr){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse(){
        return adresse;
    }

    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }

    public String getFornavn(){
        return fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getEtternavn(){
        return etternavn;
    }

    public void setTelefonnr(){
        this.telefonnr = telefonnr;
    }

    public String getTelefonnr(){
        return telefonnr;
    }

    public String SkrivUt(){
        String ut = "Fornavn: "+getFornavn()+"\n"+"Etternavn: "+getEtternavn()+"\n"
                +"Adresse: "+getAdresse()+"\n"+"Telefonnummer: "+getTelefonnr();
        return ut;
    }

    public static void main(String[] args) {
        String fornavn = JOptionPane.showInputDialog("Skriv inn fornavnet ditt");
        String etternavn = JOptionPane.showInputDialog("Skriv inn etternavnet ditt");
        String adresse = JOptionPane.showInputDialog("Skriv inn adresset ditt");
        String telefonnr = JOptionPane.showInputDialog("Skriv inn telefonnummeret ditt");

        Person person1 = new Person(fornavn,etternavn,adresse,telefonnr);
        String ut = person1.SkrivUt();
        JOptionPane.showMessageDialog(null,ut);

    }
}
