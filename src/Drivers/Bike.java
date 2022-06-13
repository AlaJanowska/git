package Drivers;

public class Bike implements Vehicle{
    @Override
    public void jedź(int speed) {
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
