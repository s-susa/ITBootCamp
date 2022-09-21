package Domaci10;


import java.time.LocalDate;
import java.util.ArrayList;


public class Automobil {
    private final String marka;
    private String boja;
    private final int brSasije;
    private final int godiste;
    private double cena;

    public Automobil(String marka, String boja, int brSasije, int godiste, int cena) {
        this.marka = marka;
        this.boja = boja;
        this.brSasije = brSasije;
        this.godiste = godiste;
        this.cena = cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }


    public String getMarka() {
        return marka;
    }

    public String getBoja() {
        return boja;
    }

    public int getBrSasije() {
        return brSasije;
    }

    public int getGodiste() {
        return godiste;
    }

    public double getCena() {
        return cena;
    }


    public String toString() {
        return "Marka: " + marka + ", Boja: " + boja + ", Broj Sasije: " + brSasije + ", Godiste: " + godiste + ", Cena: " + cena;
    }

    public void oldTimer() {
        if (marka.equalsIgnoreCase("Mercedes") && LocalDate.now().getYear() - godiste > 20) {
            setCena(cena * 0.8);
        } else if (marka.equalsIgnoreCase("bmw") && LocalDate.now().getYear() - godiste > 25) {
            setCena(cena * 0.7);
        }
    }

    public ArrayList<Automobil> cenaManja(ArrayList<Automobil> lista, int svotaNovca) {
        ArrayList<Automobil> uBudzetu = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (svotaNovca >= lista.get(i).getCena()) {
                uBudzetu.add(lista.get(i));
            }
        }
        return uBudzetu;
    }

    public ArrayList<Automobil> sviBeli(ArrayList<Automobil> lista) {
        ArrayList<Automobil> beliAutomobili = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (boja.equalsIgnoreCase(lista.get(i).getBoja())) {
                beliAutomobili.add(lista.get(i));
            }
        }
        return beliAutomobili;

    }
}