import java.util.Scanner;

public class OperatoryPorownania {

    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Give first number:");
        int firstNumber = numberScanner.nextInt();

        System.out.println("Give second number:");
        int secondNumber = numberScanner.nextInt();

        System.out.println("a > b: " + (firstNumber > secondNumber));
        System.out.println("a >= b: " + (firstNumber >= secondNumber));
        System.out.println("a < b: " + (firstNumber < secondNumber));
        System.out.println("a <= b: " + (firstNumber <= secondNumber));
        System.out.println("a = b: " + (firstNumber == secondNumber));
        System.out.println("a =/ b: " + (firstNumber != secondNumber));
    }
}
