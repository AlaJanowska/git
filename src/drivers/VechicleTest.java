package drivers;

public class VechicleTest {
    public static void main(String[] args) {

        Bike rower = new Bike();
        vehicleInfo(rower,15);

        var auto = new Car();
        vehicleInfo(auto,100);

        var pojazd = getVehicle("bike");
        vehicleInfo(pojazd, 50);
    }


    private static void vehicleInfo(Vehicle vehicle,int speed){
        vehicle.info();
        vehicle.jedz(speed);
        vehicle.hamuj();
    }

    private static Vehicle getVehicle(String name) {
        if (name.equals("bike")) {
            return new Bike();
        } else if (name.equals("car")) {
            return new Car();
        } else {
            return null;

        }
    }
}

