package org.example.app.factory;

import org.example.app.api.Vehicle;
import org.example.app.model.vehicles.Bicycle;
import org.example.app.model.vehicles.Car;
import org.example.app.model.vehicles.Scooter;

public class VehicleFactory {
    public Vehicle createVehicle(String typeVehicle) throws IllegalArgumentException {

        if (typeVehicle == null) {
            throw new IllegalArgumentException("Значение null для типа транспорта");
        }

        return switch (typeVehicle.toLowerCase()) {
            case "car" -> new Car();
            case "bicycle" -> new Bicycle();
            case "scooter" -> new Scooter();
            default -> throw new IllegalArgumentException("Не известный тип транспорта");
        };

    }
}
