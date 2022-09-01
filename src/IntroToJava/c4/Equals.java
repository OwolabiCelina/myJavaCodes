package IntroToJava.c4;

import java.util.Scanner;

public class Equals {
    public static String sort(int integer1, int integer2) {

//        Scanner sc = new Scanner(System.in);

        if (integer1 == integer2) {
        return "Number is equal";
        }
        return "Number is not equal";
    }

    public static String banke(){
        String firstName = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        firstName = sc.nextLine();

        return firstName;
    }
}


