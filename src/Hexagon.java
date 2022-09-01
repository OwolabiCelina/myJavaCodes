import java.util.Scanner;

public class Hexagon {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter s");
//        double sum = input.nextDouble();
//
//        double area = 0;
//        area = 6 * (sum * sum) / (4 * Math.tan(3.14 / 6));
//
//        System.out.printf("%f",area );
//    }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter s");
        double number = input.nextDouble();
        System.out.println("Enter n");
        double sum = input.nextDouble();

        double area = 0;
        double n = 0;
        area = sum * (number * number) / (4 * Math.tan(3.1416 / sum));

        System.out.printf("%f", area);
    }
}

