package com.example.parkingLot.controllers;

import com.example.parkingLot.dtos.IssueTicketRequestDto;
import com.example.parkingLot.dtos.IssueTicketResponseDto;
import com.example.parkingLot.dtos.ResponseStatus;
import com.example.parkingLot.models.Ticket;
import com.example.parkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto issueTicketRequestDto){
        IssueTicketResponseDto responseDto = new IssueTicketResponseDto();

        try{
            Ticket ticket = ticketService.issueTicket(issueTicketRequestDto.getGateId(),
                                        issueTicketRequestDto.getVehicleNumber(),
                                        issueTicketRequestDto.getOwnerName(),
                                        issueTicketRequestDto.getVehicleType());
            responseDto.setTicket(ticket);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        }
        catch(Exception e){
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }
}
