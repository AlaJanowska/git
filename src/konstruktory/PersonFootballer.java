package konstruktory;

public class PersonFootballer extends Person {

    public String footballClub;

    public PersonFootballer(String name, int age, String footballClub) {
        super(name, age);
        System.out.println("jestem w konstruktorze Konstruktory.PersonFootballer");
        this.footballClub = footballClub;
    }

    public void playFootball(){
        System.out.println("I'm " + name + " and I'm " + age + ". I'm playing football");
    }

    public void eat(){
        System.out.println("I prefer healthy food.");
    }
}
