package carrent;

import data.fahrzeuge.Pkw;
import java.util.Scanner;

public class CarRent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String pkwName = scanner.nextLine();

        System.out.println("Grundtarif: ");
        int pkwGrundtarif = Integer.parseInt(scanner.nextLine());

        System.out.println("Tuerenanzahl: ");
        int pkwTuerenanzahl = Integer.parseInt(scanner.nextLine());

        System.out.println("Getriebe: ");
        String pkwGetriebe = scanner.nextLine();

        System.out.println("Maximales Tankvolumen: ");
        int pkwMaxTankvolumen = Integer.parseInt(scanner.nextLine());

        System.out.println("Aktuelles Tankvolumen: ");
        int pkwTankvolumen = Integer.parseInt(scanner.nextLine());

        Pkw pkw = new Pkw(pkwName, pkwGrundtarif, true, pkwTuerenanzahl, pkwGetriebe, pkwTankvolumen, pkwMaxTankvolumen);
        System.out.println(pkw);

        System.out.println("Wollen Sie den PKW tanken?");
        boolean input = Boolean.parseBoolean(scanner.nextLine());

        if (input == true) {
            int full = pkw.getMaxTank();
            int old = pkw.getTank();
            int difference = full - old;
            
            if (pkw.getTank() < pkw.getMaxTank()) {
                System.out.println("Sie haben " + difference + " Liter getankt.");
                pkw.setTank(pkw.getMaxTank());
                
                System.out.println("---");
                System.out.println(pkw);
            }

        } else {
            System.out.println(pkw);
        }

    }

}
