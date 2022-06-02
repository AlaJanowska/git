import java.util.Scanner;

public class CustomScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię:");
        String name = scanner.nextLine();
        System.out.println( "Cześć " + name + ". Miło mi Cię poznać!");

    }
}
