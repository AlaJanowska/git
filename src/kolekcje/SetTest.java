package kolekcje;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("strawberry");
        fruits.add("apple");

//        System.out.println(fruits.size());
//        System.out.println(fruits.contains("orange"));

        for (String fruit:fruits){
            System.out.println(fruit.toUpperCase());
        }


    }
}
