public class Car {
    public String marka;
    public String model;
    public int rok;
    public int przebieg;

    /**konstruktor - najlepiej dodać między deklaracją zmiennych a metodami */
    public Car(String marka, String model, int rok, int przebieg){
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;
    }
    public void jedz () {
        System.out.println("jedź");
    }

    public void hamuj () {
        System.out.println("hamuj!");
    }

    public void info(){
        System.out.println("Marka " + marka);
        System.out.println("Model " + model);
        System.out.println("Rok produkcji " + rok);
        System.out.println("Przebieg " + przebieg);
    }
}
