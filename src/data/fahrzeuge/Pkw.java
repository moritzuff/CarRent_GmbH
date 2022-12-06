package data.fahrzeuge;

public class Pkw {
    
    private String name;
    private int grundtarif;
    private boolean verfuegbarkeit;
    private int tuerenazahl;
    private String getriebe;
    
    

    public Pkw(String name, int grundtarif, boolean verfuegbarkeit, int tuerenazahl, boolean klimaanlage, boolean radio, int kmstand, String schutz, String schadstoffBKL, String treibstoff, String verbrauch, int tankvolumen, int leistung, String kennzeichen, int baujahr, int gewicht, boolean anhaengerkupplung, String getriebe) {
        this.name = name;
        this.grundtarif = grundtarif;
        this.verfuegbarkeit = verfuegbarkeit;
        this.tuerenazahl = tuerenazahl;
        this.getriebe = getriebe;
    }

    public Pkw(String name, int grundtarif, boolean verfuegbarkeit, int tuerenazahl, String getriebe) {
        this.name = name;
        this.grundtarif = grundtarif;
        this.verfuegbarkeit = verfuegbarkeit;
        this.tuerenazahl = tuerenazahl;
        this.getriebe = getriebe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrundtarif() {
        return grundtarif;
    }

    public void setGrundtarif(int grundtarif) {
        this.grundtarif = grundtarif;
    }

    public boolean isVerfuegbarkeit() {
        return verfuegbarkeit;
    }

    public void setVerfuegbarkeit(boolean verfuegbarkeit) {
        this.verfuegbarkeit = verfuegbarkeit;
    }

    public int getTuerenazahl() {
        return tuerenazahl;
    }

    public void setTuerenazahl(int tuerenazahl) {
        this.tuerenazahl = tuerenazahl;
    }

    public String getGetriebe() {
        return getriebe;
    }

    public void setGetriebe(String getriebe) {
        this.getriebe = getriebe;
    }

    

    
    

}