package com.example.parkingLot.strategies.spotAssignmentStrategy;

import com.example.parkingLot.models.Gate;
import com.example.parkingLot.models.ParkingSpot;
import com.example.parkingLot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assginSpot(VehicleType vehicleType, Gate gate);
}
