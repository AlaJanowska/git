package konstruktory;

public class PersonTeacher extends Person {
    public String schoolName;

    public PersonTeacher(String name, int age, String nazwaUczelni) {
        super(name, age);
        System.out.println("jestem w konstruktorze Konstruktory.PersonTeacher");
        this.schoolName = nazwaUczelni;
    }

    public void teachMath(){
        System.out.println("I'm teaching Math.");
    }

    public void walk(){
        System.out.println("I prefer running.");
    }
}
