package parkinglot.stratergy;

import parkinglot.models.Gate;
import parkinglot.models.Slot;
import parkinglot.models.VehicleType;

import java.util.Optional;

public interface SlotAssignmentStratergy {
    public Optional<Slot> getSlot(VehicleType vehicleType, Gate g);
}
