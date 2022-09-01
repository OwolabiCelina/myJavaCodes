package IntroToJava.c3;

import java.util.Scanner;

public class Radius {

    static double radius =0;
    static double area = 0;
    static double PI = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        if (radius >= 0){
            area = radius * radius * PI;
            area = 1.5 * 1.5 * 3.142;
            System.out.println("The area for the circle of radius is " + radius + " is " + area);
        }

    }
}
