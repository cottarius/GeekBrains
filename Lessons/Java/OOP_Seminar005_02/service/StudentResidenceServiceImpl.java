package service;

import model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentResidenceServiceImpl implements StudentResidenceService{
    Map<Integer, List<Student>> map = new HashMap<>();

    public Map<Integer, List<Student>> createRoom (int number, List<Student> list){
        map.put(number, list);
        return map;
    }
    public void getRooms(){
        for (Map.Entry<Integer, List<Student>> item : map.entrySet()){
            System.out.printf("Room %d Students %s", item.getKey(),item.getValue() + "\n");
        }
    }
}
