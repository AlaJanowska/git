public class CarMetods {
    public static void main(String[] args) {

        Car mazda = new Car();
        mazda.marka = "Mazda";
        mazda.model = "6";
        mazda.rok = 2015;
        mazda.przebieg = 195000;

        mazda.info();
        mazda.jedz();
        mazda.hamuj();

        Car audi = new Car();
        audi.marka= "Audi";
        audi.model = "A5";
        audi.rok = 2020;
        audi.przebieg = 20000;

        audi.info();
        audi.jedz();
        audi.hamuj();


    }
}
