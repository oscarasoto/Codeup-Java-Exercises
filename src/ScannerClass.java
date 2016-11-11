import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        /*int userIntInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        userIntInput = sc.nextInt();
        System.out.println("You entered: " + userIntInput);

        String userInput;
        sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        userInput = sc.nextLine();
        System.out.println("You entered: " + userInput);

        String firstWord;
        String secondWord;
        String thirdWord;
        sc = new Scanner(System.in);
        System.out.println("Please enter 3 words ");
        firstWord = sc.next();
        secondWord = sc.next();
        thirdWord = sc.next();
        System.out.println("You entered: " + firstWord + " " + secondWord + " " + thirdWord );*/

        // Calculate the perimeter and area of various classrooms at Codeup based on user input.
        boolean userWantToContinue = true;
        double width;
        double length;
        double height;
        double area;
        double perimeter;
        double volume;
        String userInput;

        do {
            System.out.println("This program calculates the perimeter, area and volume of various classrooms at Codeup based on user input");
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the width of the classroom: ");
            width = scan.nextDouble();
            System.out.println("Please enter the length of the classroom: ");
            length = scan.nextDouble();
            System.out.println("Please enter the height of the classroom: ");
            height = scan.nextDouble();
            area = calculateArea(width, length);
            perimeter = calculatePerimeter(width, length);
            volume = calculateVolume(area, height);

            System.out.println("The area of the classroom is: " + area);
            System.out.println("The perimeter of the classroom is: " + perimeter);
            System.out.println("The volume of the classroom is: " + volume);

            Scanner sc = new Scanner(System.in);

            System.out.println("Do you want to continue, yes/no : ");
            userInput = sc.next();
            if (userInput.equals("no")) { // userinput == "no"
                userWantToContinue = false;
            }

        } while (userWantToContinue);

        System.out.println("Thanks !");

    }

    private static double calculateArea (double width, double length) {
        return width * length;
    }

    private static double calculatePerimeter (double width, double length) {
        return (2 * width) + (2 * length);
    }

    private static double calculateVolume (double area, double height) {
        return area * height;
    }

}
