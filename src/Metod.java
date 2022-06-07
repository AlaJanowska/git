public class Metod {

    public void policzWynik(int number) {
        System.out.println("Zaraz policzę wynik.");
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + i;
        }
        System.out.println("Wynik to: " + result);
    }

    public int pokazWynik() {
        System.out.println("Zaraz policzę wynik.");
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result = result + i;
        }
        System.out.println("Wynik to: " + result);
        return result;
    }

    public int add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + result);
        return result;
    }
}
