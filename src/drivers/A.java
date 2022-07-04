package drivers;

public class A {

    static String staticName;
    String name;

    public A(String name) {
        this.name = name;
    }

    public void dajNazwa(){
        y();
        System.out.println("to " + name);
    }

    public static void y(){
        System.out.println("to y");
    }


}
