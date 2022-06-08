public class CarMetods {
    public static void main(String[] args) {

        Car mazda = new Car("Mazda", "6", 2015, 195500);
        mazda.info();
        mazda.jedz();
        mazda.hamuj();

        Car audi = new Car("Audi", "A5", 2020, 20000);

        audi.info();
        audi.jedz();
        audi.hamuj();


    }
}
