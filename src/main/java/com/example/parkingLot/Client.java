package com.example.parkingLot;

import com.example.parkingLot.controllers.TicketController;
import com.example.parkingLot.dtos.IssueTicketRequestDto;
import com.example.parkingLot.dtos.IssueTicketResponseDto;
import com.example.parkingLot.models.VehicleType;
import com.example.parkingLot.repositories.GateRepository;
import com.example.parkingLot.repositories.ParkingLotRepository;
import com.example.parkingLot.repositories.TicketRepository;
import com.example.parkingLot.repositories.VehicleRepository;
import com.example.parkingLot.services.TicketService;

public class Client {
    public static void main(String[] args) {

        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();

        TicketService ticketService = new TicketService(gateRepository, vehicleRepository, parkingLotRepository, ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDto requestDto = new IssueTicketRequestDto();
        requestDto.setGateId(1235L);
        requestDto.setOwnerName("Apoorv");
        requestDto.setVehicleNumber("KAX00101B");
        requestDto.setVehicleType(VehicleType.LARGE);


        IssueTicketResponseDto responseDto = ticketController.issueTicket(requestDto);

    }
}
