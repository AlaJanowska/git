package exception;

import java.util.Scanner;

public class Exceptions {

       public static void main(String[] args) throws InvalidAgeException{

        System.out.println("Podaj swój wiek");
        Scanner scaner = new Scanner(System.in);
        int age = scaner.nextInt();

        if (age<0) {
            throw new InvalidAgeException("Age is not valid");
        }
        if (age >= 18){
            System.out.println("Jesteś pełnoletni");
        }else{
            System.out.println("Nie jesteś pełnoletni");
        }
    }
}
