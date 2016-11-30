/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package movies;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");


        do {
            System.out.println("What kind of movie are you renting?");
            String type = scanner.next();

            Movie movie = new Movie(type);

            System.out.println("How many days are you going to rent it?");
            int days = scanner.nextInt();

            // Tell don't ask

            System.out.println("You'll pay $" + movie.price(days));  // encapsulation

            System.out.println("Do you want to rent another movie (y/n) ?");

        } while ("y".equalsIgnoreCase(scanner.next()));
    }
}
