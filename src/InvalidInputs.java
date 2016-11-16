import java.util.Scanner;

public class InvalidInputs {
    public static void main(String[] args) {
        boolean userWantsToContinue = true;
        String[] studentsName = {"James", "Larry", "Tom", "Lacy"};
        String[] studentsAge = {"15", "16", "17", "18"};
        String userInput;
        String studentName;


        do {

            studentName = captureUserInput();
            checkStudent(studentName.toLowerCase(), studentsName, studentsAge);

            // Check if the user wants to continue
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to continue yes/no");
            userInput = sc.nextLine();
            if (userInput.equals("no")) {
                userWantsToContinue = false;
            }

        } while (userWantsToContinue);
    }

    private static String captureUserInput () {
        String userInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a student name: ");
        userInput = sc.nextLine();

        if (isInteger(userInput)){
            System.out.println("Please enter a valid name, only characters.");
            return captureUserInput();
        }

        return userInput;
    }

    private static void checkStudent (String studentName, String[] studentsName, String[] studentsAge){

        for (int i = 0; i < studentsName.length; i ++){
            if (studentsName[i].toLowerCase().equals(studentName)) {
                System.out.println("Student " + studentName + " was found");
                System.out.println(studentName + " age is: " + studentsAge[i]);
            }
        }
        System.out.println("Student " + studentName + " was not found");

    }

    private static boolean isInteger(String input) {
        boolean isInteger = false;

        try
        {
            Integer.parseInt(input);
            isInteger = true;
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return isInteger;
    }


}
