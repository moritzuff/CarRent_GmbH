package data.methods.createvehicle;

import data.fahrzeuge.Lkw;
import java.util.Scanner;

public class CreateLkwMethod {

    public void CreateLKW() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie den Namen des LKWs ein.");
        String lkwName = scanner.next();

        System.out.println("Bitte geben Sie den Laderaum [l] ein.");
        double lkwLaderaum = scanner.nextDouble();

        System.out.println("Bitte geben Sie die Nutzlast [t] ein.");
        double lkwNutzlast = scanner.nextDouble();

        System.out.println("Bitte geben Sie den km-Preis [EUR] ein.");
        double lkwKmPreis = scanner.nextDouble();

        System.out.println("Bitte geben Sie die freien km pro Tag ein.");
        int lkwFreieKm = scanner.nextInt();

        System.out.println("Bitte geben Sie die benötigte Fahrlizenz ein.");
        String lkwFS = scanner.next();

        Lkw lkw = new Lkw(lkwName, lkwLaderaum, lkwNutzlast, lkwKmPreis, lkwFreieKm, lkwFS);
        System.out.println("Der LKW " + lkwName + " wurde erfolgreich erstellt.");
    }
}
