import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumber = numberScanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = numberScanner.nextInt();

        Calculator calc = new Calculator();
        int addition = calc.addition(firstNumber, secondNumber);
        int subtraction = calc.subtraction(firstNumber, secondNumber);
        int multiple = calc.multiple(firstNumber, secondNumber);
        int division = calc.division(firstNumber, secondNumber);

        System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowanie: " + subtraction);
        System.out.println("Mnożenie: " + multiple);
        System.out.println("Dzieleni: " + division);

    }
}
