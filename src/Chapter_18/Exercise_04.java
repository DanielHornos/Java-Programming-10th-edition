package Chapter_18;

/**
 * (Sum series)
 * Write a recursive method to compute the following series:
 *  1 + 1/2 + 1/3 + 1/i ...
 *
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 * Created by Daniel Hornos Valiente on 12/1/16.
 */
public class Exercise_04 {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            System.out.println(m(i));
        }

    }

    public static double m(int i) {
        if (i <= 0) return 0;
        if (i == 1)
            return 1;
        else
            return m(i - 1) + 1.0 / i;

    }
}
