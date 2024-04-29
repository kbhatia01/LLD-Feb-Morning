package parkinglot.stratergy;

import parkinglot.models.Gate;
import parkinglot.models.Slot;
import parkinglot.models.VehicleType;

import java.util.Optional;

public class RandomSlotGenrator implements SlotAssignmentStratergy {


    @Override
    public Optional<Slot> getSlot(VehicleType vehicleType, Gate g) {
        // find parkingLot from gate..
        // find a floor with allowed vehicle type
        // return the slot with same type where status is empty..

        return Optional.empty();
    }
}
