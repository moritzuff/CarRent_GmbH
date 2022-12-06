package carrent;

public class Lkw {
    private double laderaum;
    private double nutzlast;
    private double kmPreis;
    private int freieKmProTag;
    private String fuehrerscheinAnforderung;

    public double getLaderaum() {
        return laderaum;
    }

    public void setLaderaum(double laderaum) {
        this.laderaum = laderaum;
    }

    public double getNutzlast() {
        return nutzlast;
    }

    public void setNutzlast(double nutzlast) {
        this.nutzlast = nutzlast;
    }

    public double getKmPreis() {
        return kmPreis;
    }

    public void setKmPreis(double kmPreis) {
        this.kmPreis = kmPreis;
    }

    public int getFreieKmProTag() {
        return freieKmProTag;
    }

    public void setFreieKmProTag(int freieKmProTag) {
        this.freieKmProTag = freieKmProTag;
    }

    public String getFuehrerscheinAnforderung() {
        return fuehrerscheinAnforderung;
    }

    public void setFuehrerscheinAnforderung(String fuehrerscheinAnforderung) {
        this.fuehrerscheinAnforderung = fuehrerscheinAnforderung;
    }
    
}
