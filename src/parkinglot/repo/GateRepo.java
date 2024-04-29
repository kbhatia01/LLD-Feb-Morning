package parkinglot.repo;

import parkinglot.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepo {
    private Map<Integer, Gate> gateMap = new HashMap<>();

    public Optional<Gate> findGateById(int gateId){
        if(gateMap.containsKey(gateId)){
            return Optional.of(gateMap.get(gateId));
        }
        return Optional.empty();
    }
}
