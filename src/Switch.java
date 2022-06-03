import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {


      Scanner menuScanner = new Scanner(System.in);
      System.out.println("Wpisz nazwę dania aby poznać cenę: ");
      String dish = menuScanner.nextLine();

        switch (dish){
            case "zupa":
                System.out.println("cena 10 zł");
                break;
            case "danie główne":
                System.out.println("cena 30 zł");
                break;
            case "deser":
                System.out.println("cena 20 zł");
                break;
            default:
                System.out.println("brak dania w karcie");
                break;
        }
    }
}
