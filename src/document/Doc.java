package document;

public interface Doc {
    default void getDocDescription(){
        System.out.println("I am documnet description");
    }

}
