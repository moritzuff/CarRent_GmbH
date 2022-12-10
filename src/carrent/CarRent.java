package carrent;

import data.fahrzeuge.Pkw;
import java.util.Scanner;

public class CarRent {

    private static Pkw p1;
    private static Pkw p2;
    private static Pkw p3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Name: ");
            String pkwName = scanner.nextLine();

            System.out.println("Grundtarif: ");
            int pkwGrundtarif = Integer.parseInt(scanner.nextLine());

            System.out.println("Tuerenanzahl: ");
            int pkwTuerenanzahl = Integer.parseInt(scanner.nextLine());

            System.out.println("Getriebe: ");
            String pkwGetriebe = scanner.nextLine();

            Pkw tmp = new Pkw(pkwName, pkwGrundtarif, true, pkwTuerenanzahl, pkwGetriebe);

            switch (i) {
                case 0:
                    p1 = tmp;
                    break;
                case 1:
                    p2 = tmp;
                    break;
                case 2:
                    p3 = tmp;
                    break;
            }
        }

        System.out.println("Folgende PKWs wurden erstellt: ");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }

}
