package data.fahrzeuge;

import java.util.Scanner;

public class Lkw {
    
    private String name;
    private double laderaum;
    private double nutzlast;
    private double kmPreis;
    private int freieKmProTag;
    private String fuehrerscheinAnforderung;

    public Lkw(String name, double laderaum, double nutzlast, double kmPreis, int freieKmProTag, String fuehrerscheinAnforderung) {
        this.name = name;
        this.laderaum = laderaum;
        this.nutzlast = nutzlast;
        this.kmPreis = kmPreis;
        this.freieKmProTag = freieKmProTag;
        this.fuehrerscheinAnforderung = fuehrerscheinAnforderung;
    }

    @Override
    public String toString() {
        return "Lkw{" + "name=" + name + ", laderaum=" + laderaum + ", nutzlast=" + nutzlast + ", kmPreis=" + kmPreis + ", freieKmProTag=" + freieKmProTag + ", fuehrerscheinAnforderung=" + fuehrerscheinAnforderung + '}';
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
    
    public void createLKW() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie den Namen des LKWs ein.");
        String lkwName = scanner.nextLine();

        System.out.println("Bitte geben Sie den Laderaum [l] ein.");
        double lkwLaderaum = scanner.nextDouble();

        System.out.println("Bitte geben Sie die Nutzlast [t] ein.");
        double lkwNutzlast = scanner.nextDouble();

        System.out.println("Bitte geben Sie den km-Preis [EUR] ein.");
        double lkwKmPreis = scanner.nextDouble();

        System.out.println("Bitte geben Sie die freien km pro Tag ein.");
        int lkwFreieKm = scanner.nextInt();

        System.out.println("Bitte geben Sie die benötigte Fahrlizenz ein.");
        String lkwFS = scanner.nextLine();

        Lkw lkw = new Lkw(lkwName, lkwLaderaum, lkwNutzlast, lkwKmPreis, lkwFreieKm, lkwFS);
        System.out.println("Der LKW " + lkwName + " wurde erfolgreich erstellt.");
    }
    
}
