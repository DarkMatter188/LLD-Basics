package com.example.parkingLot.dtos;

import com.example.parkingLot.models.Vehicle;
import com.example.parkingLot.models.VehicleType;

public class IssueTicketRequestDto {
    private Long gateId;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String ownerName;

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long id) {
        this.gateId = id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
