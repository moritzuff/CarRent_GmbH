package data.methods.createvehicle;

import java.util.Scanner;

public class CreateVehicleMethod {

    public void createVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PKW oder LKW?");
        String eingabe = scanner.next();

        while (true) {

            if (eingabe.equalsIgnoreCase("pkw")) {
                new CreatePkwMethod().createPKW();
                break;
            } else if (eingabe.equalsIgnoreCase("lkw")) {
                new CreateLkwMethod().createLKW();
                break;
            } else {
                createVehicle();
            }
        }
    }
}
