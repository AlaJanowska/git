package drivers;

public class VechicleTest {
    public static void main(String[] args) {

        /** lista wszystkich enum **/

        System.out.println("Lista: ");

        VehicleType[] vehicleTypes = VehicleType.values();

        for (int i = 0; i < vehicleTypes.length; i++) {
            System.out.println( (i+1) + ". " + vehicleTypes[i].name + " " + vehicleTypes[i].country);
        }

      // Bike rower = new Bike();
      // vehicleInfo(rower,15);

       //var auto = new Car();
      // vehicleInfo(auto,100);

        var pojazd = getVehicle(VehicleType.BIKE);
        vehicleInfo(pojazd, 20);

    }

// metoda "vehicleInfo" - po wywołaniu pokazuje akcje na pojeżdzie (info, jedz, hamuj)
    private static void vehicleInfo(Vehicle vehicle,int speed){
        vehicle.info();
        vehicle.jedz(speed);
    }

    private static Vehicle getVehicle(VehicleType type) {
        if (type.name.equals("Audi")) {
            System.out.println(type.name + " - kraj: " + type.country);
            return new Car();

        } else {
            System.out.println(type.name + " - kraj: " + type.country);
            return new Bike();
        }
    }
}

