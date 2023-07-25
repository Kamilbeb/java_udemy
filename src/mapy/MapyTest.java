package mapy;

import java.util.HashMap;
import java.util.Map;

public class MapyTest {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(1,"Tomasz");
        students.put(2,"Anna");
        students.put(3,"Jan");

        System.out.println(students.get(1));

        Map<Integer, String> otherStudents = new HashMap<>();
        otherStudents.putAll(students);
        System.out.println(otherStudents.containsKey(1));
        System.out.println(otherStudents.containsValue("Marek"));
        System.out.println(otherStudents.isEmpty());
        System.out.println(otherStudents.size());

        otherStudents.remove(2);
        System.out.println(otherStudents.size());

        for(Integer key : students.keySet()){
            System.out.println(key);
            System.out.println(students.get(key));
        }

        for(String student : students.values()){
            System.out.println(student);
        }


    }
}
