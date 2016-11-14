import java.util.Scanner;

public class GradesToLetters {
    public static void main(String[] args) {

        boolean userWantsToContinue = true;
        int userInputGrade;
        String userInput;

       do {

           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a numerical grade: ");
           userInputGrade = sc.nextInt();

           if ((userInputGrade <= 100) && (userInputGrade >= 88)){
               System.out.println("Your letter grade is: A");
           }
           if ((userInputGrade <= 87) && (userInputGrade >= 80)){
               System.out.println("Your letter grade is: B");
           }
           if ((userInputGrade <= 79) && (userInputGrade >= 67)){
               System.out.println("Your letter grade is: C");
           }
           if ((userInputGrade <= 66) && (userInputGrade >= 60)){
               System.out.println("Your letter grade is: D");
           }
           if ((userInputGrade <= 60) && (userInputGrade >= 0)){
               System.out.println("Your letter grade is: F");
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
