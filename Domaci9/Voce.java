package Domaci9;

public abstract class Voce {
    private String ime;
    private String sezona;
    private  double cenaZaKilogram;
    private String boja;

    public Voce(String ime, String sezona, double cenaZaKilogram, String boja) {
        this.ime = ime;
        this.sezona = sezona;
        this.cenaZaKilogram = cenaZaKilogram;
        this.boja = boja;
    }


    public String getIme() {
        return ime;
    }

    public String getSezona() {
        return sezona;
    }

    public double getCenaZaKilogram() {
        return cenaZaKilogram;
    }

    public String getBoja() {
        return boja;
    }

    public void setCenaZaKilogram(double cenaZaKilogram) {
        this.cenaZaKilogram = cenaZaKilogram;
    }

    public boolean jeSezona(String sezona){
        boolean status = false;
        if (getSezona().equalsIgnoreCase(sezona)){
            status = true;
        }
        return status;
    }
    public double sumaVoca(double pare){
        double kolicna = pare / getCenaZaKilogram();
        return kolicna;
    }


}