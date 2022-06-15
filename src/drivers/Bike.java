package drivers;

public class Bike implements Vehicle{
    @Override
    public void jedz(int speed) {
        System.out.println("Rower jedzie z prędkością: " + speed);
    }

    @Override
    public void hamuj() {
        System.out.println("Hamuj!!!");
    }

    @Override
    public void info() {
        System.out.println("Rower");
    }

}
