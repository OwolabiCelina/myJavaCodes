package chapterTwo;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner banke = new Scanner(System.in);

        System.out.println("Enter first integer");
        int number1 = banke.nextInt();

        System.out.println("Enter second integer");
        int number2 = banke.nextInt();

        int squareOfFirstNumber = number1 * number1;
        System.out.println("Square of first number = " + squareOfFirstNumber);

        int squareOfSecondNumber = number2 * number2;
        System.out.println("Square of second number = " + squareOfSecondNumber);

        int sumOfSquare = squareOfFirstNumber + squareOfSecondNumber;
        System.out.println("Sum of Square = " + sumOfSquare);

        int diff = squareOfFirstNumber - squareOfSecondNumber;
        System.out.println("Difference of square = " + diff);
    }
}


