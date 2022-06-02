public class OperatoryLogiczne {

    public static void main(String[] args) {
        boolean first = true;
        boolean second = false;
        boolean third = true;
        boolean fourth = false;

        //&&
        System.out.println(first && second); //false
        System.out.println(first && third); // true

        // ||
        System.out.println(third || fourth); //true
        System.out.println(second|| fourth); //false

        // !
        System.out.println(!first); // false
        System.out.println(!second); //true
        System.out.println(!(first && second)); //true

    }
}
