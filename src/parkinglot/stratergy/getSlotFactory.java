package parkinglot.stratergy;

import parkinglot.models.SlotAssignmentStrategyEnum;

public class getSlotFactory {

    public static SlotAssignmentStratergy getSlotStrategy(SlotAssignmentStrategyEnum e){
        if(e.equals(SlotAssignmentStrategyEnum.RANDOM)){
            return new RandomSlotGenrator();
        }

        return null;

    }
}
