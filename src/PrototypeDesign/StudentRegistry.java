package PrototypeDesign;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String, Student> m1 = new HashMap<>();

    void Register(String s, Student val){
        m1.put(s, val);
    }
    Student get(String key){
        return m1.get(key).copy();
    }
}
