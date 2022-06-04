import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Array {
    public static void main(String[] args) {
//        String[] name = new String[3];
//        name[0] = "Ala";
//        name[1] = "Tomek";
//        name[2] = "Maja";
//        System.out.println(name[0]);
//        System.out.println(name[1]);
//        System.out.println(name[2]);
//

//        String[] names = new String[]{"ala", "kasia", "ola"};
//        System.out.println(names[0] + ", " + names[1] + ", " + names[2]);

//
//        int[] numbers = new int[] {1,2,3,4,5};
//        for (int i=0; i< numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }}

        /* Praca domowa: */
        /**  wypisać liczby od 1-100 podzielne przez 3; */

//        for (int i=1; i<=100; i++) {
//            if (i%3 == 0){
//                System.out.println(i);
//            }
//        }

        /** - odwrócić elementy tablicy [1,3,5] -> [5,3,1]; */
        int[] numbers = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i]; //  [0]->1 - zapamiętąć, element z indeksem 0 ma wartość 1
                                   //  [1]->2 - zapamiętąć, element z indeksem 1 ma wartość 2
            numbers[i] = numbers[numbers.length - 1 - i]; // - do elementu z indeksem 0 przypisać wartość z elementu z indeksem 4
                                                          //- do elementu z indeksem 1 przypisać wartość z elementu z indeksem 4
            numbers[numbers.length - 1 - i] = temp; // do elementu z indeksem 4 przypisać warość temp 1
                                                    // do elementu z indeksem 3 przypisać warość temp 2
        }
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
    }

}
