import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumber = numberScanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = numberScanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiple = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int modulo = firstNumber%secondNumber;

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Wynik odejmowania: " + subtraction);
        System.out.println("Wynik mnożenia: " + multiple);
        System.out.println("Wynik dzielenia: " + division);
        System.out.println("Wynik modulo: " + modulo);


    }
}
