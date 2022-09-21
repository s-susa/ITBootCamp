package Domaci11;


public class Zaposleni {

    private String ime;
    private String pozicija;
    private int godiste;
    private int dnevnica;
    private int sati;
    private int smena;

    public Zaposleni(String ime, String pozicija, int godiste, int dnevnica, int sati, int smena) {
        this.ime = ime;
        this.pozicija = pozicija;
        this.godiste = godiste;
        this.dnevnica = dnevnica;
        this.sati = sati;
        this.smena = smena;
    }

    public String getIme() {
        return ime;
    }

    public String getPozicija() {
        return pozicija;
    }

    public int getGodiste() {
        return godiste;
    }

    public int getDnevnica() {
        return dnevnica;
    }

    public int getSati() {
        return sati;
    }

    public int getSmena() {
        return smena;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public void setDnevnica(int dnevnica) {
        this.dnevnica = dnevnica;
    }

    public void setSati(int sati) {
        this.sati = sati;
    }

    public void setSmena(int smena) {
        this.smena = smena;
    }


    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (!(object instanceof Zaposleni)) {
            return false;
        }

        Zaposleni zaposleniKojiSePoredi = (Zaposleni) object;

        return this.getIme().equals(zaposleniKojiSePoredi.getIme())
                && this.getPozicija().equals(zaposleniKojiSePoredi.getPozicija())
                && this.getGodiste()==zaposleniKojiSePoredi.getGodiste()
                && this.getDnevnica()==zaposleniKojiSePoredi.getDnevnica()
                && this.getSati()==zaposleniKojiSePoredi.getSati()
                && this.getSmena()==zaposleniKojiSePoredi.getSmena();

    }

    @Override
    public String toString() {
        return "Zaposleni{" +
                "ime='" + ime + '\'' +
                ", pozicija='" + pozicija + '\'' +
                ", godiste=" + godiste +
                ", dnevnica=" + dnevnica +
                ", sati=" + sati +
                ", smena=" + smena +
                '}';
    }
}