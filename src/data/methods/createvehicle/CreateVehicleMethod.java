package data.methods.createvehicle;

import java.util.Scanner;

public class CreateVehicleMethod {

    public void CreateVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PKW oder LKW?");
        String eingabe = scanner.next();

        while (true) {

            if (eingabe.equalsIgnoreCase("pkw")) {
                new CreatePkwMethod().CreatePKW();
                break;

            } else if (eingabe.equalsIgnoreCase("lkw")) {
                new CreateLkwMethod().CreateLKW();
                break;
            } else {
                CreateVehicle();
            }
        }
    }
}
