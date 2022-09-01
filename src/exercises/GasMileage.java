package exercises;

import java.util.Scanner;

public class GasMileage {

    public static void displayMilesPerGallon(){

        Scanner input = new Scanner(System.in);
        double miles = 0;
        double gallons = 0;
        double totalMiles = 0;
        double totalGallons = 0;

        System.out.println("Enter miles driven or -1 to quit ");
        int milesDriven = input.nextInt();

        System.out.println("Enter gallons used or -1 to quit ");
        int gallonsUsed = input.nextInt();


        while(miles != -1 && gallons != -1){
            totalMiles = totalMiles + miles;
            totalGallons = totalGallons + gallons;

            System.out.println("Enter miles driven or -1 to quit");
            miles = input.nextInt();
            System.out.println("Enter gallons used or -1 to quit");
            gallons = input.nextInt();
        }

        if (miles != 0 && gallons != 0){
            miles = totalMiles / totalGallons;
            double average = totalGallons / totalMiles;


            System.out.printf("Total of miles driven and gallons used is: %d%n%d%n", miles, gallons);
            System.out.printf("Trip average is %.2f%n", average);
        }
        else System.out.println("There was no trip");

    }

    public static void main(String[] args) {
        GasMileage.displayMilesPerGallon();
    }


}
