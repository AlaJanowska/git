import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumber = numberScanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = numberScanner.nextInt();

        //wyniki
        System.out.println("Wynik dodawania: " + (firstNumber + secondNumber));
        System.out.println("Wynik odejmowania: " + (firstNumber - secondNumber));
        System.out.println("Wynik mnożenia: " + (firstNumber * secondNumber));
        System.out.println("Wynik dzielenia: " + (firstNumber / secondNumber));
        System.out.println("Wynik modulo: " + (firstNumber%secondNumber));


    }
}
