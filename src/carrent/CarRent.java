package carrent;

import data.fahrzeuge.Lkw;
import data.fahrzeuge.Pkw;
import data.methods.CreateLkw;
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
                new CreateLkw().CreateLKW();
                break;
                
            } else {

            }

        }
    }

}
