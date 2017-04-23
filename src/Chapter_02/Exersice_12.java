package Chapter_02;

import java.util.Scanner;

/**
 * Chapter 2 Exercise 12:
 *
 *      (Physics: finding runway length)
 *
 * Created by Daniel Hornos Valiente on 6/20/16.
 */
public class Exersice_12 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = (speed * speed) / (2 * acceleration);
        System.out.print("The minimum runway length for this airplane is " + length);
    }
}
