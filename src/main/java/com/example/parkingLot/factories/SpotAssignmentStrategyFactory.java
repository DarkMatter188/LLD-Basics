package com.example.parkingLot.factories;

import com.example.parkingLot.models.SpotAssignmentStrategyType;
import com.example.parkingLot.strategies.spotAssignmentStrategy.CheapestSpotAssignmentStrategy;
import com.example.parkingLot.strategies.spotAssignmentStrategy.RandomSpotAssignmentStrategy;
import com.example.parkingLot.strategies.spotAssignmentStrategy.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotAssignmentStrategy(SpotAssignmentStrategyType spotAssignmentStrategyType) {
        if(spotAssignmentStrategyType.equals(SpotAssignmentStrategyType.CHEAPEST)){
            return new CheapestSpotAssignmentStrategy();
        }
        else if(spotAssignmentStrategyType.equals(SpotAssignmentStrategyType.RANDOM)){
            return new RandomSpotAssignmentStrategy();
        }
        else{
            return null;
        }
    }
}
