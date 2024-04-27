package org.example.parkinglotsst.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ParkingSpot extends BaseModel {
    private List<VehicleType> supportedVehicleTypes;
    private ParkingSpotStatus parkingSpotStatus;
    private int spotNumber;
    private ParkingFloor parkingFloor;

}