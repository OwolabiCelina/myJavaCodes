package IntroToJava.c4;

import java.util.Scanner;

public class MultidimensionalArray {

    public static int [] sumOfArray(int [][] myArray){
        int sum = 0;
        int [] totals = new int[myArray.length];

        for (int rows = 0; rows < myArray.length; rows++){
            for (int columns = 0; columns < myArray[rows].length; columns++){
                sum = myArray[rows][columns];
            }
            totals[rows] = sum;
        }
        return (totals);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] [] newArray = new int[5][5];

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.printf("Enter Number %d: ", i+1);
                newArray[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
}
