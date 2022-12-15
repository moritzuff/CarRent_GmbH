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

        Pkw pkw = new Pkw(pkwName, pkwGrundtarif, true, pkwTuerenanzahl, pkwGetriebe, pkwMaxTankvolumen, pkwTankvolumen);
        System.out.println(pkw);

        System.out.println("Wollen Sie den PKW tanken?");
        boolean input = Boolean.parseBoolean(scanner.nextLine());

        double full = pkw.getTankMax();
        double old = pkw.getTank();
        double difference = full - old;
        boolean state = true;

        while (state) {
            if (input == true) {
                System.out.println("Wie viel Liter wollen Sie tanken?");
                double pkwNeuTank = Double.parseDouble(scanner.nextLine());

                if (pkwNeuTank > 100 || pkwNeuTank > difference || pkwNeuTank < 1) {
                    System.out.println("Sie können nur 1-" + difference + " Liter tanken!");
                    state = true;
                } else if (pkwNeuTank < 100 || pkwNeuTank < difference || pkwNeuTank > 1) {
                    pkw.setTank(old + pkwNeuTank);
                    System.out.println("Sie haben " + pkwNeuTank + " Liter getankt.");
                    System.out.println("Ihr Tankvolumen beträgt aktuell: " + pkw.getTank() + " Liter.");
                    state = false;
                }

            }

        }

    }

}
