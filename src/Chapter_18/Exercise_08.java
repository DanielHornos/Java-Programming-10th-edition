package Chapter_18;

import java.util.Scanner;

/**
 * (Print the digits in an integer reversely)
 * Write a recursive method that displays an int value reversely
 * on the console using the following header:
 *
 *  public static void reverseDisplay(int value)
 *
 * For example, reverseDisplay(12345) displays 54321. Write a test program
 * that prompts the user to enter an integer and displays its reversal.
 *
 * Created by Daniel Hornos Valiente on 12/2/16.
 */
public class Exercise_08 {

    public static void main(String[] args) {

        System.out.print("Enter an integer: ");
        int value = new Scanner(System.in).nextInt();
        reverseDisplay(value);

    }

    public static void reverseDisplay(int value) {

        if (value <= 0)
            return;

        System.out.print(value % 10);
        reverseDisplay(value / 10);
    }
}
