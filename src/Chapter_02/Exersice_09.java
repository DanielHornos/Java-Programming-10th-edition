package Chapter_02;

import java.util.Scanner;

/**
 * Chapter 2 Exercise 9:
 *      (Physics: acceleration)
 * Created by Daniel Hornos Valiente on 6/20/16.
 */
public class Exersice_09 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double acceleration = (v1 - v0) / t;
        System.out.print("The average acceleration is " + acceleration);

    }
}
