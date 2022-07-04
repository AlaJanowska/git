package drivers;

public class Main {
    public static void main(String[] args) {
      /**  A obiekt1 = new A("a1");
        A obiekt2 = new A("a2");
        System.out.println(A.staticName);
        A.y();

        obiekt1.dajNazwa();
        obiekt2.dajNazwa();


        //konwerowanie danych

        int a = 10;
        double b = 5.5;

        double c = a/b;
        double d = a/(int)b;

        System.out.println(c);
        System.out.println(d);

        */
        //wyjątki - nie było błędu w kodzie a jadnak po wykonaniu kodu pojawił się exception

        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 5;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
