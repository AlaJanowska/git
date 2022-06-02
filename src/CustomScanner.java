import javax.print.attribute.standard.PresentationDirection;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class CustomScanner {

    public static void main(String[] args) {

        //welcome
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię:");
        String name = scanner.nextLine();
        System.out.println( "Cześć " + name + " Miło mi Cię poznać!");

        //calculator
        System.out.println("Podaj rok swojego urodzenia:");
        int year = scanner.nextInt();
        int result = ZonedDateTime.now().getYear() - year;
        System.out.println("Masz " + result + "lat!");

    }
}
