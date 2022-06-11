public class PersonTest {
    public static void main(String[] args) {
        PersonTeacher p1 = new PersonTeacher("ala", 26,"UE");
        p1.walk();
        p1.eat();
        p1.teachMath();


        PersonFootballer f1 = new PersonFootballer("tomek", 27, "Madrid");
        f1.eat();
        f1.walk();
        f1.playFootball();
    }
}
