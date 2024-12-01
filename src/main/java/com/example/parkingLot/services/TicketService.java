package com.example.parkingLot.services;

import com.example.parkingLot.exceptions.GateNotFoundException;
import com.example.parkingLot.exceptions.SpotNotAvailableException;
import com.example.parkingLot.factories.SpotAssignmentStrategyFactory;
import com.example.parkingLot.models.*;
import com.example.parkingLot.repositories.GateRepository;
import com.example.parkingLot.repositories.ParkingLotRepository;
import com.example.parkingLot.repositories.TicketRepository;
import com.example.parkingLot.repositories.VehicleRepository;
import com.example.parkingLot.strategies.spotAssignmentStrategy.SpotAssignmentStrategy;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository,
                         ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(Long gateId,
                              String vehicleNumber,
                              String ownerName,
                              VehicleType vehicleType) throws GateNotFoundException, SpotNotAvailableException {
        //Try to create all attributes needed to return op Ticket
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);
        if(optionalGate.isEmpty()){
            throw new GateNotFoundException("Gate with id " + gateId + " not found.");
        }
        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);

        Optional<Vehicle> optionalVehicle = vehicleRepository.findVehicleByNumber(vehicleNumber);
        Vehicle savedVehicle = null;
        if(optionalVehicle.isEmpty()){
            //Save vehicle as it is coming to parking lot for first time
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setOwnerName(ownerName);
            vehicle.setVehicleType(vehicleType);
            savedVehicle = vehicleRepository.save(vehicle);
        }
        else{
            savedVehicle = optionalVehicle.get();
        }

        ticket.setVehicle(savedVehicle);
        String number = RandomStringUtils.randomAlphanumeric(10);
        ticket.setNumber(number);

        //To get parkingspot on basis of spotstrategy need to get first parkinglot obj then it has spotstrategy
        //To get parkinglot we have gateId to get lot object so create repo newly and use factory

        Optional<ParkingLot> optionalParkingLot = parkingLotRepository.findByGateId(gateId);
        if(optionalParkingLot.isEmpty()){
            throw new RuntimeException("Parking Lot does not exist.");
        }
        ParkingLot parkingLot = optionalParkingLot.get();
        SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.
                                                            getSpotAssignmentStrategy(parkingLot.getSpotAssignmentStrategyType());

        ParkingSpot parkingSpot = spotAssignmentStrategy.assginSpot(vehicleType, gate);
        if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.NOT_AVAILABLE)){
            throw new SpotNotAvailableException("Spot not available!");
        }
        ticket.setParkingSpot(parkingSpot);

        return ticketRepository.save(ticket);

    }
}
