/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers 
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */


/**
 * NAME                 : Madilyn Ball
 * GROUP                : APCS-A
 * LAST MODIFIED        : 08 September 2025
 * PROBLEM ID           : Lewis 2.3 Arithmetic Problem
 * PROBLEM DESCRIPTION  : An application that reads two floating point numbers
 *                        and prints their sum, difference, and product.
 * SOURCES I USED       : Lewis Java Software Solutions 3rd Edition
 * PEOPLE I HELPED      :
 * PEOPLE WHO HELPED ME : Mr Houtrouw, Mr Afsal
 */
import java.util.Scanner;

public class SumProductAverage
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Madilyn Ball\nAPCS-A\nLewis Problem 2.3\n");
        System.out.print("\nEnter the number of times you want to run the program: ");
        int numRuns = sc.nextInt();
        for (int j = 0; j < numRuns; j++){
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter the third number: ");
            double num3 = sc.nextDouble();

            double sum = num1 + num2 + num3;
            double product = num1 * num2 * num3;
            double average = sum / 3.0;
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            System.out.println("Average: " + average);
            System.out.println();
        }
        sc.close();
    }
}
