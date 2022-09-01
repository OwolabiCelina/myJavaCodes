package chapterTwo;

import java.util.Scanner;

public class BMI {

    static double weightInPounds;
    double heightInInches;
    double bmi;

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight ");
        double weight = input.nextDouble();

        System.out.println("Enter height");
        double height  = input.nextDouble();

        double bmi = weight / ( height * height) * 703;
        System.out.printf("Average bmi:%f%n", weight, height);

    }
}
