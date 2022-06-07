import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumber = numberScanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = numberScanner.nextInt();

        Calculator calc = new Calculator();
        calc.addition(firstNumber,secondNumber);
        calc.subtraction(firstNumber,secondNumber);
        calc.multiple(firstNumber,secondNumber);
        calc.division(firstNumber,secondNumber);


    }
}
