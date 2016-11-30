package circle;

import java.util.Scanner;

/**
 * Calculate a circle’s circumference and area.
 *
 * @author Oscar Soto on 11/30/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
public class CircleApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Welcome to the Circle Application");
        Circle circle;
        do {

            double radius = getRadius(input);
            circle = new Circle(radius);

            System.out.println("The circumference of this circle is: " + circle.getFormattedCircumference());
            System.out.println("The area of this circle is: " + circle.getFormattedArea());


            System.out.println("Do you want to do another circle (y/n) ?");

        } while ("y".equalsIgnoreCase(input.next()));

        System.out.println("Goodbye !, the number of circles you built was: " + Circle.getObjectCount());

    }

    private static double getRadius(Scanner input) {
        System.out.println("Enter the radius of your circle: ");
        String radius = input.next();
        if (Validator.isValidDouble(radius)) {
            return Validator.validValue();
        } else {
            System.out.println("Enter a valid value (only numbers)");
            return getRadius(input);
        }
    }
}
