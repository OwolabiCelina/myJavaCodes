import java.util.Scanner;

public class SumNumbers {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

////        for (int i = 0; i <= x; i++){
////            for (int y = 1; y > x -1; y--)
////
////            System.out.println("Enter lowest number");
////        }
////        System.out.println("");
////    }
//        int number = 0;
//        int largest = 0;
//        int lowest = -20000000;
//
//
//        while (number <= 5) {
//            System.out.println("enter number");
//            number = input.nextInt();
//            System.out.println("enter number");
//            number = input.nextInt();
//            System.out.println("enter number");
//            number = input.nextInt();
//            System.out.println("enter number");
//            number = input.nextInt();
//            System.out.println("enter number");
//            number = input.nextInt();
//
//            if (number >= largest)
//                number = largest;
//            System.out.printf("largest number is %d%n", largest);
//
//            if (number <= lowest) {
//                number = lowest;
//            }
//            System.out.printf("lowest number is %d", lowest);
//
//        }
//    }

        System.out.println("enter number 1");
        var user_input = scanner.nextInt();

        var largest_number = scanner.nextInt();
        var lowest_number = scanner.nextInt();

        int count = 1;

        while (count < 5) ;
        System.out.printf("enter number %d: ", count + 1);
        user_input = scanner.nextInt();

        var larger = user_input > largest_number;
        var lower = user_input < lowest_number;

        if (user_input == largest_number) {
            largest_number = user_input;

        }
        if (user_input == lowest_number) {
            lowest_number = user_input;

        } count = count + 1;


        System.out.println("largest number is %d");
    }
}