"CreateVehicle":

public void createVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PKW oder LKW?");
        String eingabe = scanner.next();

        if (eingabe.equalsIgnoreCase("pkw")) {
            new CreatePkwMethod().createPKW();
            
        } else if (eingabe.equalsIgnoreCase("lkw")) {
            new CreateLkwMethod().createLKW();
            
        } else {
            createVehicle();
        }

    }