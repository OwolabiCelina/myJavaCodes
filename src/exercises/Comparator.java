package exercises;

import java.util.Scanner;

public class Comparator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input number1");
        int num = input.nextInt();

        System.out.println("Input number2");
        int num2 = input.nextInt();

        if (num == num2){
            System.out.println(0);
        }
        else if (num > num2) {
            System.out.println(1);
        }
        else if (num2 > num) {
            System.out.println(-1);
        }
    }
}
