package Domaci9;

public class Breskva extends Voce{

    public Breskva(String ime, String sezona,double cenaZaKilogram, String boja){
        super(ime,sezona,cenaZaKilogram,boja);
    }


    public void smanjiCenuBreskva(String boja){
        if (boja.equalsIgnoreCase("zelena")){
            double popust = getCenaZaKilogram() * 0.15;
            setCenaZaKilogram(getCenaZaKilogram() - popust);
        }
    }
}
