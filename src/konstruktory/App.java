package konstruktory;//stworzyć klasę bazową Konstruktory.App - zawiera pole name i metodę appInfo, dodaj konstrukotr do któego przekażesz wartość name
// stwórz klasę potomną Konstruktory.AndroidApp i Konstruktory.IphoneApp - zawiera metode runAndroidApp / runIphoneApp

public class App {
    public String name;

    public App(String name){
        System.out.println("konstruktor Konstruktory.App");
        this.name = name;
    }

    public void appInfo(){
        System.out.println("Run app: " + name);
    }

}
