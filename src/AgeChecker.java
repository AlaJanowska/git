import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner ageScanner = new Scanner(System.in);
        System.out.println("Podaj ile masz lat:");
        int age = ageScanner.nextInt();

        if (age >=18){
            System.out.println("Jesteś pełnoletni");
        }else if(age<0) {
            System.out.println("Ujemna wartość, podaj poprawne dane");
        }else {
            System.out.println("Jesteś niepełnoletni");
        }
    }
}
