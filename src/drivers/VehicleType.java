package drivers;

public enum VehicleType {
    CAR("Audi", "Niemcy"),
    BIKE("Unibike", "Polska");

    String name;
    String country;

    VehicleType(String name, String country){
        this.name = name;
        this.country = country;

    }

}
