package carrent;

import java.util.Date;

public class Kunde {
    
    private String vorname;
    private String nachname;
    private String adresse;
    private String führerscheinnummer;
    private int telefonnummer;
    private Date geburtsdatum;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getFührerscheinnummer() {
        return führerscheinnummer;
    }

    public void setFührerscheinnummer(String führerscheinnummer) {
        this.führerscheinnummer = führerscheinnummer;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }
    

}
