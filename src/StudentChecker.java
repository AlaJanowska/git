public class StudentChecker {

    //zadanie - stwórz 3 obiekty klasy Student. przypisz wartości do pol. Stwórz tablicę i dodaj studentów do tablicy, uruchom na nich metody.

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alicja";
        s1.secondName = "Łazarska";
        s1.kierunek = "FiR";
        s1.indexNumber = 160490;

        Student s2 = new Student();
        s2.name = "Tomasz";
        s2.secondName = "Łazarski";
        s2.kierunek = "Informatyka";
        s2.indexNumber = 152569;

        Student s3 = new Student();
        s3.name = "Aleksandra";
        s3.secondName = "Nowak";
        s3.kierunek = "Biologia";
        s3.indexNumber = 195856;

        Student[] studentArray = new Student[]{s1,s2,s3};

        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i].przedstawSie();

        }


    }
}
