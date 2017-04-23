package Chapter_04;

/**
 * Chapter 4 Exercise 16:
 *
 *      (Random character)
 *      Write a program that displays a random
 *      uppercase letter using the Math.random() method.
 *
 * Created by Daniel Hornos Valiente on 8/23/16.
 */
public class Exercise_16 {

    public static void main(String[] args) {

        char ch = (char)(Math.random() * 26 + 'A');

        System.out.println(ch);
    }
}
