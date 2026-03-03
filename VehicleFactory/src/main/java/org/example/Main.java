package org.example;

import org.example.app.api.Vehicle;
import org.example.app.factory.VehicleFactory;

import static java.lang.IO.println;

public class Main {
    static void main() {
        //Пример
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.createVehicle("Car");
        Vehicle bicycle = vehicleFactory.createVehicle("Bicycle");
        Vehicle scooter = vehicleFactory.createVehicle("scooter");

        car.drive();
        bicycle.drive();
        scooter.drive();

        try {
            String typeVehicle = null;
            Vehicle ban = vehicleFactory.createVehicle(typeVehicle);


        } catch (IllegalArgumentException e) {
            println(e);
        }
    }
}
