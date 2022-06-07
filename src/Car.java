public class Car {
    public String marka;
    public String model;
    public int rok;
    public int przebieg;

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
