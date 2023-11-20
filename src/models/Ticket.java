package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class Ticket {
    private String id;
    private Date entryTime;
    private ParkingSpot parkingSpot;
    private Gate issuingGate;
    private ParkingAttendant parkingAttendant;
    private Vehicle vehicle;
}