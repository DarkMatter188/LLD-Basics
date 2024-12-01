package com.example.parkingLot.repositories;

import com.example.parkingLot.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    Map<Long, Gate> gateMap;
    Long id;
    public GateRepository() {
        gateMap = new HashMap<>();
        id = 0L;
    }
    public Gate save(Gate gate) {
        if(id == 0L){
            //Insert operation
            id = id + 1;
            gate.setId(id);
            gateMap.put(id, gate);
            return gate;
        }

        //Update operation
        gateMap.put(gate.getId(), gate);
        return gate;
    }

    public Optional<Gate> findById(Long gateId){
        if(gateMap.containsKey(gateId)){
            return Optional.of(gateMap.get(gateId));
        }
        return Optional.empty();
    }

}
