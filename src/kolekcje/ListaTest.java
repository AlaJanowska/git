package kolekcje;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaTest {
    public static void main(String[] args) {

        //Kolekcje - lista (ArrayList)
        List<String> names = new ArrayList<>();
        names.add("Ala");
        names.add("Piotr");
        names.add("Ola");

        List<String> names2 = new ArrayList<>();
        names2.addAll(names);


        //Kolekcje - lista (LinkedList)
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

//        System.out.println(numbers.get(1));

//        Pętla po wszystkich pozycjach listy
        for (int i = 0; i < names2.size(); i++) {
            System.out.println(i+1 + ". " + names2.get(i));
        }

        //lub

        for (Integer number:numbers){
            System.out.println(number);
        }
    }

}
