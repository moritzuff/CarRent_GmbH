package carrent;

import data.fahrzeuge.Lkw;
import data.fahrzeuge.Pkw;
import java.util.Scanner;


public class CarRent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("PKW oder LKW?");
        String eingabe = scanner.next();

        while (true) {

            if (eingabe.equalsIgnoreCase("PKW")) {
                Pkw car1 = new Pkw("placeholder", 0, true, 0, "placeholder");

                System.out.println("Bitte geben Sie den Namen des PKWs ein.");
                String pkwName = scanner.next();
                car1.setName(pkwName);

                System.out.println("Bitte geben Sie den Grundtarif [EUR] ein.");
                int pkwGrundtarif = scanner.nextInt();
                car1.setGrundtarif(pkwGrundtarif);

                System.out.println("Bitte geben Sie die Anzahl der Tueren ein.");
                int pkwTueren = scanner.nextInt();
                car1.setTuerenazahl(pkwTueren);

                System.out.println("Bitte geben Sie das Getriebe an.");
                String pkwGetriebe = scanner.next();
                car1.setGetriebe(pkwGetriebe);

                System.out.println("Der PKW " + car1.getName() + " wurde erfolgreich erstellt.");
                System.out.println("Grundtarif: " + car1.getGrundtarif());
                System.out.println("Anzahl Tueren: " + car1.getTuerenazahl());
                System.out.println("Getriebe: " + car1.getGetriebe());
                break;

            } else if (eingabe.equalsIgnoreCase("lkw")) {
                Lkw lkw1 = new Lkw("placeholder", 0, 0, 0, 0, "placeholder");

                System.out.println("Bitte geben Sie den Namen des LKWs ein.");
                String lkwName = scanner.next();
                lkw1.setName(lkwName);

                System.out.println("Bitte geben Sie den Laderaum [l] ein.");
                double lkwLaderaum = scanner.nextDouble();
                lkw1.setLaderaum(lkwLaderaum);

                System.out.println("Bitte geben Sie die Nutzlast [t] ein.");
                double lkwNutzlast = scanner.nextDouble();
                lkw1.setNutzlast(lkwNutzlast);

                System.out.println("Bitte geben Sie den km-Preis [EUR] ein.");
                double lkwKmPreis = scanner.nextDouble();
                lkw1.setKmPreis(lkwKmPreis);

                System.out.println("Bitte geben Sie die freien km pro Tag ein.");
                int lkwFreieKm = scanner.nextInt();
                lkw1.setFreieKmProTag(lkwFreieKm);

                System.out.println("Bitte geben Sie die benötigte Fahrlizenz ein.");
                String lkwFS = scanner.next();
                lkw1.setFuehrerscheinAnforderung(lkwFS);

                System.out.println("Der LKW " + lkw1.getName() + " wurde erfolgreich erstellt.");
                break;
            } else {

            }

        }
    }

}
