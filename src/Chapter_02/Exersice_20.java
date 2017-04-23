package Chapter_02;

import java.util.Scanner;

/**
 * Chapter 2 Exercise 20:
 *
 *      (Financial application: calculate interest)
 *
 * Created by Daniel Hornos Valiente on 6/20/16.
 */
public class Exersice_20 {

    public static void main(String[] Strings) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble() / 100;

        double interest = balance * (annualInterestRate / 12);

        System.out.print("The interest is " + interest);

    }
}
