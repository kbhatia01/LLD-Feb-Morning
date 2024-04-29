package parkinglot.repo;

import parkinglot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepo {

    Map<Integer, ParkingLot> capacityMap = new HashMap<>();

    public ParkingLot updateCountById(ParkingLot p){

       p.setCapacity(p.getCapacity()-1);

       return p;
    }

}
