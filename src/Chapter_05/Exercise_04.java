package Chapter_05;

/**
 * Chapter 5 Exercise 5:
 *
 *      (Conversion from miles to kilometers)
 *      Write a program that displays the following
 *      table (note that 1 mile is 1.609 kilometers)
 *
 * Created by Daniel Hornos Valiente on 8/24/16.
 */
public class Exercise_04 {

    public static void main(String[] args) {

        System.out.printf("%-12s%-8s\n", "Miles", "Kilograms");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-12d%-8.3f\n", i, i * 1.609);
        }
    }
}
