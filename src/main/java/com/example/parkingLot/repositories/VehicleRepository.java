package com.example.parkingLot.repositories;

import com.example.parkingLot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {
    Map<Long, Vehicle> vehicleMap;
    Map<String, Vehicle> vehicleNumberToVehicleMap;

    public VehicleRepository() {
        vehicleMap = new HashMap<>();
        vehicleNumberToVehicleMap = new HashMap<>();
    }

    public Optional<Vehicle> findVehicleById(long id) {
        return null;
    }

    public Optional<Vehicle> findVehicleByNumber(String number) {
        return null;
    }

    public Vehicle save(Vehicle vehicle) {
        return null;
    }

}
