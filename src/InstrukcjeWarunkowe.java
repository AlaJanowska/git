public class InstrukcjeWarunkowe {

    public static void main(String[] args) {

        float firstNumber = 0f;
        float secondNumber = 5f;
        float result = firstNumber/secondNumber;

        if (secondNumber != 0 ){
            System.out.println("Wynik dzielenia to: " + result );
        }else {
            System.out.println("Nie dzieli się przez 0, podaj poprawną liczbę!");
        }

    }
}
