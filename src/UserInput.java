import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter number");
        int number = input.nextInt();

        if (number == 1) {
            System.out.println("0");
        }else if (number == 0) {
            System.out.println("1");
        }
        else{
            System.out.println("");
        }
    }
}
