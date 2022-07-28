package kolekcje;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();
        students.put(1,"Ola");
        students.put(2,"Kasia");
        students.put(3,"Bartek");

//        System.out.println(students.get(1));

        Map<Integer, String> students2 = new HashMap<>();
        students2.putAll(students);
        students2.put(4, "Ala");

       for (Integer student:students2.keySet()){
           System.out.println(students2.get(student));
       }

       students2.remove(2);

        System.out.println("......");

       for (String student : students2.values()){
           System.out.println(student);
       }
    }
}
