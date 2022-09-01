package IntroToJava.c3;

import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("(0-single filer, 1-married jointly or qualifying widow(er), 2-married separately, 3-head of " +
                "household) Enter the filing status: ");

        int status = input.nextInt();

        System.out.println("Enter the taxable income: ");
        double income = input.nextDouble();

        double tax = 0;

        if (status == 0) {
            
            if (income <= 8350){
                tax = income * 0.10;}
            
            else if (income <= 33950){
                tax = 8350 * 0.10 + (income - 8350) * 0.15;}
            
            else if (income <= 82250){
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (income - 33950) * 0.25;}
            
            else if (income <= 171550) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) + 0.25 + (income - 82250) * 0.28;
            }
            
            else if (income <= 372950) {
                tax = 8350 * (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (income - 171550) * 0.33;
            }
            
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (372950 - 171550) * 0.33 + (income - 372950) * 0.33;
        
        }
        
        
        else if (status == 1) {
            
            if (income <= 16700){
                tax = 16700 * (67900 - 8350) * 0.10 +
                        (82250 - 67900) + 25 + (67900 - 82250) * 0.28 +
                        (16700 - 137051) * 0.33 + (income - 82250) * 0.35;

            } else if (income > 16700 || income <= 67900) {
                
            }

        }
        else if (status == 2) {
                    tax = 8350 * (33951 - 8350) * 0.15 +
                    (68525 - 33951) * 0.25 + (68525) + (33951 - 8350) * 0.28 +
                            (186475 - 104426) * 0.33 + (income - 186475) * 0.33;
        }
        else if (status == 3){
                tax = 11950 * (117451 - 11950) * 0.10 +
                        (190200 - 11950) * 0.25 + (190200 - 11950) * 0.28 +
                        (117451 - 190200) * 0.10 + (income - 190200) * 0.33;
                }
        else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }
        System.out.println("Tax is " + (int)(tax * 100) / 100.0);

    }
}