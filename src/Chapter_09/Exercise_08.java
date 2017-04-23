package Chapter_09;

import ToolKit.Fan;

/**
 * Chapter 9 Exercise 8:
 *
 *      (The Fan class) Design a class named Fan to represent a fan. The class contains:
 *          ■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed.
 *          ■ A private int data field named speed that specifies the speed of the fan (the default is SLOW).
 *          ■ A private boolean data field named on that specifies whether the fan is on (the default is false).
 *          ■ A private double data field named radius that specifies the radius of the fan (the default is 5).
 *          ■ A string data field named color that specifies the color of the fan (the default is blue).
 *          ■ The accessor and mutator methods for all four data fields.
 *          ■ A no-arg constructor that creates a default fan.
 *          ■ A method named toString() that returns a string description for the fan.
 *
 *      If the fan is on, the method returns the fan speed, color, and radius in one combined string.
 *      If the fan is not on, the method returns the fan color and radius along with the string
 *      “fan is off” in one combined string.
 *
 *      Draw the UML diagram for the class and then implement the class.
 *      Write a test program that creates two Fan objects. Assign maximum speed,
 *      radius 10, color yellow, and turn it on to the first object.
 *      Assign medium speed, radius 5, color blue, and turn it off to the second object.
 *      Display the objects by invoking their toString method.
 *
 * Created by Daniel Hornos Valiente on 9/1/16.
 */
public class Exercise_08 {

    public static void main(String[] args) {

        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan #1: "+fan1.toString());
        System.out.println("Fan #2: "+fan2.toString());
    }
}
