package Domaci8;

public class Ucenik {
    private String ime;
    private String prezime;
    private int godine;
    private int[] ocene;

    public Ucenik(String ime, String prezime, int godine, int[] ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.ocene = ocene;
    }


    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodine() {
        return godine;
    }

    public int[] getOcene() {
        return ocene;
    }


    public void setOcene(int[] ocene) {
        this.ocene = ocene;
    }

    public static String notifikacija(int[] ocene) {
        int brojJedinica = 0;
        String imaJedinicu = "";
        for (int i = 0; i < ocene.length; i++) {
            if (ocene[i] == 1) {
                brojJedinica++;
                imaJedinicu = "Imas " + brojJedinica + " jedinicu!";
                System.out.println(imaJedinicu);

            }
        }return imaJedinicu;
    }
    public static double prosek( int[] ocene) {
        double suma = 0;
        for (int i = 0; i < ocene.length; i++) {
            suma += ocene[i];
        }
        suma /= ocene.length;
        System.out.println(suma);

        return suma;
    }
    public static void main(String[]args){
        Ucenik stefan = new Ucenik("Stefan","Susa", 27, new int[]{3,4,1,5});
        notifikacija(stefan.getOcene());
        prosek(stefan.getOcene());
    }
}

