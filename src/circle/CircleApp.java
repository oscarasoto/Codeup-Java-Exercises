package circle;

import java.util.Scanner;

/**
 * @author Oscar Soto on 11/30/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
public class CircleApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Welcome to the Circle Application");

        do {

            System.out.println("Enter the radius of your circle: ");
            double radius = input.nextDouble();
            Circle circle = new Circle(radius);

            System.out.println("The circumference of this circle is: " + circle.getFormattedCircumference());
            System.out.println("The area of this circle is: " + circle.getFormattedArea());


            System.out.println("Do you want to do another circle (y/n) ?");

        } while ("y".equalsIgnoreCase(input.next()));

        System.out.println("Goodbye !, the number of circles you built was: " + Circle.getObjectCount());

    }
}
