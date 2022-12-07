package data.methods.createvehicle;

import data.fahrzeuge.Pkw;
import java.util.Scanner;

public class CreatePkwMethod {

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
}
