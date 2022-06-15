package drivers;

public class Car implements Vehicle{


    @Override
    public void jedz(int speed) {
        System.out.println("Auto jedzie z prędkością: " + speed);
    }

    @Override
    public void hamuj() {
        System.out.println("Hamuj!!!");
    }

    @Override
    public void info() {
            System.out.println("Auto");
    }

    public void cos(){

    }
}
