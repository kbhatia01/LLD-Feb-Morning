package parkinglot.repo;

import parkinglot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepo {

    private int preInsertedId = -1;

    Map<String, Vehicle> vehicleMap = new HashMap<>();

    public Optional<Vehicle> findVehicleByNumber(String vehicleNumber){
        if(vehicleMap.containsKey(vehicleNumber)){
            return Optional.of(vehicleMap.get(vehicleNumber));
        }

        return Optional.empty();
    }

    public Vehicle saveVehicle(Vehicle v){
       int newId =  preInsertedId +1;

       v.setId(newId);
       vehicleMap.put(v.getVehicleName(), v);

       this.preInsertedId+=1;
       return v;


    }
}
