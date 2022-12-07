package carrent;

import data.fahrzeuge.Lkw;
import data.fahrzeuge.Pkw;
import java.util.Scanner;
import data.methods.CreatePkw;

public class CarRent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("PKW oder LKW?");
        String eingabe = scanner.next();

        while (true) {

            if (eingabe.equalsIgnoreCase("PKW")) {
                new CreatePkw().CreatePKW();
                break;

            } else if (eingabe.equalsIgnoreCase("lkw")) {
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

                Lkw lkw = new Lkw(lkwName, lkwLaderaum, lkwNutzlast, lkwKmPreis, lkwFreieKm, eingabe);

                break;
            } else {

            }

        }
    }

}
