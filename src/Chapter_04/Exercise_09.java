package Chapter_04;

import java.util.Scanner;

/**
 * Chapter 4 Exercise 9:
 *
 *      (Find the Unicode of a character)
 *      Write a program that receives a character and
 *      displays its Unicode.
 *
 * Created by Daniel Hornos Valiente on 8/23/16.
 */
public class Exercise_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);
        input.close();

        System.out.println("The Unicode for the character " + character + " is " + (int) character);
    }
}
