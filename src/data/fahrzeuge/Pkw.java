package data.fahrzeuge;

import java.util.Scanner;

public class Pkw {

    private String name;
    private int grundtarif;
    private boolean verfuegbarkeit;
    private int tuerenazahl;
    private String getriebe;
    private double tankMax;
    private double tank;

    public Pkw(String name, int grundtarif, boolean verfuegbarkeit, int tuerenazahl, String getriebe, double tankMax, double tank) {
        this.name = name;
        this.grundtarif = grundtarif;
        this.verfuegbarkeit = verfuegbarkeit;
        this.tuerenazahl = tuerenazahl;
        this.getriebe = getriebe;
        this.tankMax = tankMax;
        this.tank = tank;
    }

    @Override
    public String toString() {
        return "Pkw{" + "name=" + name + ", grundtarif=" + grundtarif + ", verfuegbarkeit=" + verfuegbarkeit + ", tuerenazahl=" + tuerenazahl + ", getriebe=" + getriebe + ", tankMax=" + tankMax + ", tank=" + tank + '}';
    }

    public double getTankMax() {
        return tankMax;
    }

    public void setTankMax(double tankMax) {
        this.tankMax = tankMax;
    }

    public double getTank() {
        return tank;
    }

    public void setTank(double tank) {
        this.tank = tank;
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
    
    /*
    public void createPKW() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie den Namen des PKWs ein.");
        String pkwName = scanner.nextLine();

        System.out.println("Bitte geben Sie den Grundtarif [EUR] ein.");
        int pkwGrundtarif = scanner.nextInt();

        System.out.println("Bitte geben Sie die Anzahl der Tueren ein.");
        int pkwTueren = scanner.nextInt();

        System.out.println("Bitte geben Sie das Getriebe an.");
        String pkwGetriebe = scanner.next();

        Pkw pkw = new Pkw(pkwName, pkwGrundtarif, true, pkwTueren, pkwGetriebe);
        System.out.println("Der PKW " + pkwName + " wurde erfolgreich erstellt.");
    }
*/

}
