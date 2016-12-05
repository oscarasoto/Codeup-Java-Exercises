package Countries;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * Maintain a list of countries
 *
 * @author oscarsoto on 12/5/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
public class CountriesApp {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        CountriesTextFile countriesTextFile = new CountriesTextFile();

        System.out.println("Welcome to the Countries Application");

        do {
            System.out.println("1 - Display a list of countries");
            System.out.println("2 - Add a new country");
            System.out.println("3 - Exit ");

            int selection = input.nextInt();

            switch (selection) {
                case 1:
                    displayCountries(countriesTextFile);
                    break;
                case 2:
                    countriesTextFile.writeCountries(getNewCountry(input));
                    break;
                case 3:
                    System.out.println("Goodbye!");
            }

            System.out.println("Do you want to continue (y/n): ");
        } while (input.next().equalsIgnoreCase("y"));
    }

    private static void displayCountries (CountriesTextFile countriesTextFile) throws IOException {
        List<String> countries = countriesTextFile.readCountries();

        for (String country : countries) {
            System.out.println(country);
        }

    }

    private static List<String> getNewCountry (Scanner input){
        List<String> countries = new ArrayList<>();

        do {
            System.out.println("Enter country name: ");
            countries.add(input.next());

            System.out.println("Do you want to enter another country (y/n): ");
        } while (input.next().equalsIgnoreCase("y"));

        return countries;

    }
}
