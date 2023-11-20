package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ParkingSpot {
    private int spotNumber;
    private VehicleType supportedVehicleType;
    private SpotStatus spotStatus;
    private int floorNumber;
    private Vehicle vehicle;
}
