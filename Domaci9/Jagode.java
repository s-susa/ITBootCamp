package Domaci9;

public class Jagode extends Voce {
    public Jagode(String ime, String sezona, double cenaZaKilogram, String boja) {
        super(ime, sezona, cenaZaKilogram, boja);

    }

    public void povecajCenuJagoda(String sezona){
        if (sezona != "leto"){
            double poskupljenje = getCenaZaKilogram() *0.2;
            setCenaZaKilogram(getCenaZaKilogram()+poskupljenje);
        }
    }
}
