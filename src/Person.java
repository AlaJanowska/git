public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void przedstawSie() {
        System.out.println("Jestem " + name + " i mam " + age + " lat");
    }
}
