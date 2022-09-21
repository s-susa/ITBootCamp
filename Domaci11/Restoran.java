package Domaci11;

import java.util.ArrayList;


public class Restoran {

    private ArrayList <Zaposleni> zaposleni;

    public Restoran(ArrayList<Zaposleni> zaposleni) {
        this.zaposleni = zaposleni;
    }


    public ArrayList<Zaposleni> stampajKonobare(int smena){
        ArrayList<Zaposleni> stampajKonobare = new ArrayList<>();
        for (int i = 0; i < zaposleni.size() ; i++) {
            if(zaposleni.get(i).getSmena()==smena
                    && zaposleni.get(i).getPozicija().equalsIgnoreCase("konobar") ){
                stampajKonobare.add(zaposleni.get(i));

            }

        }
        for (Zaposleni zaposleni : stampajKonobare) {
            System.out.println(zaposleni);
        }
        return stampajKonobare;

    }
    public void povecajCenuTrecojSmeni(ArrayList<Zaposleni> zaposleni){
        for (int i = 0; i < zaposleni.size(); i++) {
            if(zaposleni.get(i).getSmena()== 3){
                zaposleni.get(i).setDnevnica
                        (zaposleni.get(i).getDnevnica() + zaposleni.get(i).getDnevnica()*30/100);
                System.out.println(zaposleni.get(i));
            }

        }

    }

}

