import java.util.Scanner;

public class TableOfPowers {
    public static void main(String[] args) {

        int userInputNumber;
        boolean userWantsToContinue = true;
        String userInput;


        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            userInputNumber = sc.nextInt();

            for(int i =0; i <= userInputNumber; i++){
                System.out.println("The square and cube of " + i + " is " + Math.pow(i, 2) + " and " + Math.pow(i, 3));

            }

           sc = new Scanner(System.in);
            System.out.println("Do you want to continue yes/no");
            userInput = sc.nextLine();
            if (userInput.equals("no")) { // userinput == "no"
                userWantsToContinue = false;
            }

        } while (userWantsToContinue);

    }
}
