package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ParkingAttendant {
    private String name;
    private String email;
}
