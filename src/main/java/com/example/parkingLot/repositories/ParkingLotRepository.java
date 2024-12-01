package com.example.parkingLot.repositories;

import com.example.parkingLot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ParkingLotRepository {
    Map<Long, ParkingLot> parkingLotMap;

    public ParkingLotRepository() {
        parkingLotMap = new HashMap<>();
    }

    public Optional<ParkingLot> findByGateId(Long gateId){
        return null;
    }
}
