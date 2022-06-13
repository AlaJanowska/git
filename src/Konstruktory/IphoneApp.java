package Konstruktory;

import Konstruktory.App;

public class IphoneApp extends App {

    public IphoneApp(String name) {
        super(name);
        System.out.println("konstruktor Iphone");
    }

    public void runIphoneApp(){
        System.out.println("Run Iphone Konstruktory.App");
    }
}
