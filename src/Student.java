public class Student {
    public String name;
    public String secondName;
    public String kierunek;
    public int indexNumber;
    /** pole statyczne - dostepne dla kazdego elementu w klasie */
    public static String nazwaUczelni = "UE";

    public void przedstawSie(){
        System.out.println("Nazywam się " + name + " " + secondName + ". Studiuję na kierunku " + kierunek + ". Mój numer indeksu to " + indexNumber + ".");
    }

    public static void infoUczelnia(){
        System.out.println("Moja uczelnia to " + nazwaUczelni);
    }

}
