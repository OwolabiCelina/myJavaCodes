import java.util.Scanner;

public class GasMileage {

    private int milesPerGallon;
    private int milesPerTrip;
    private int gallonsPerTrip;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles per trip");
        int milesPerTrip = input.nextInt();

        System.out.println("Enter gallons per trip");
        int gallonsPerTrip = input.nextInt();

        System.out.println("Do you have any other inputs, \n press 1 to continue and 0 to end");
        int anythingElse = input.nextInt();

        while(anythingElse != 0) {
            System.out.println("Enter miles per trip");
            milesPerTrip = input.nextInt();

            System.out.println("Enter gallons per trip");
            gallonsPerTrip = input.nextInt();

            System.out.println("Do you have any other inputs, \n press 1 to continue and 0 to end");
            anythingElse = input.nextInt();


        }

    }
}
