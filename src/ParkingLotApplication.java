import controllers.TicketController;
import dto.GenerateTicketRequest;
import dto.GenerateTicketResponse;
import exceptions.NoParkingSpotsAvailableException;
import models.*;
import services.EntryGateService;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ParkingLotApplication {
    public static void main(String[] args) {
        Vehicle vehicle = Vehicle.builder().vehicleType(VehicleType.CAR).regNumber("2322").build();
        Vehicle suv = Vehicle.builder().vehicleType(VehicleType.SUV).regNumber("2324").build();

        ParkingAttendant pa = ParkingAttendant.builder()
                .email("abc@gmail.com")
                .name("abc")
                .build();

        Gate entryGate = Gate.builder()
                .gateNumber(1)
                .parkingAttendant(pa)
                .gateType(GateType.ENTRY)
                .build();

        ParkingLot parkingLot = ParkingLot.builder()
                .entryGates(List.of(entryGate))
                .address("Some random address")
                .name("Random names")
                .build();

        EntryGateService entryGateService = new EntryGateService();
        TicketController controller = new TicketController(entryGateService);

        try {
            GenerateTicketResponse response = controller.generateTicket(GenerateTicketRequest.builder()
                    .vehicle(vehicle)
                    .gate(entryGate)
                    .build());
        } catch (NoParkingSpotsAvailableException e) {
            throw new RuntimeException(e);
        }
    }
}