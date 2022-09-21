package Domaci13;

import java.util.ArrayList;

public class Korpa implements Racun {

    private ArrayList<Namirnice> namirnice;

    public Korpa(ArrayList<Namirnice> namirnice) {
        this.namirnice = namirnice;
    }


    public ArrayList<Namirnice> getNamirnice() {
        return namirnice;
    }

    public void setNamirnice(ArrayList<Namirnice> namirnice) {
        this.namirnice = namirnice;
    }

    @Override
    public void printNamernice() {
        for (int i = 0; i < namirnice.size(); i++) {
            System.out.println(namirnice.get(i));
        }
    }

    @Override
    public int printRacun() {
        double suma = 0;
        for (int i = 0; i < namirnice.size(); i++) {
            suma += namirnice.get(i).getCena();

        }
        return (int) suma;
    }

    @Override
    public boolean jeNaSpisku(Namirnice x) {
        boolean vrednost = false;
        for (Namirnice naminice : namirnice) {
            if (naminice.getNaziv().equalsIgnoreCase(x.getNaziv())) {
                vrednost = true;
            }


        }
        return vrednost;
    }
}