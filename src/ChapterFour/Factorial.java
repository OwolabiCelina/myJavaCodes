package ChapterFour;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        factorial1();
    }

    static void factorial1() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to get it's factorial"); // prompts for an input
        int num = input.nextInt();

        long factorial = 1; // initializes factorial
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.printf("factorial of %d = %d", num, factorial);
    }

    static void factorial2() {
        Scanner input = new Scanner(System.in);

        double e = 1.0;
        int number = 1, accuracy, factorial = 1;

        System.out.println("accuracy");
        accuracy = input.nextInt();

        while (number < accuracy) {
            factorial = factorial * number;
            e = e + 1.0 / factorial;
            number++;
        }
        System.out.printf("factorial %.5f", e);
    }

    static void modulus(){
        double m = 2030 % 1000;
        System.out.printf("m is %f", m);
    }

}