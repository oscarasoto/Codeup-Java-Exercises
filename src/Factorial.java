import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int userNumber = captureUserNumber();

        while (!checkValue(userNumber)){
            userNumber = captureUserNumber();
        }

        calculateFactorial(userNumber);


    }

    private static int captureUserNumber () {

        int userInputNumber;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10: ");
        userInputNumber = sc.nextInt();

        return userInputNumber;

    }

    private static boolean checkValue (int userInput){

        if (userInput >= 1 && userInput <= 10){
            return true;
        }
        return false;
    }



    private static void calculateFactorial (int number){
        long factorial = 1;
        String result = "1";
        String spaces = " ";

        for (int s = 1; s <= number; s ++){
            spaces += "    ";
        }

        for(int i = 1; i <= number; i++) {
            factorial = factorial * i;
            if (i != 1) {
                result += " x " + i;
            }
            System.out.println(i + "!" + " = " + result + spaces + "= " + factorial);
            spaces = spaces.substring(4,spaces.length()) + "";

        }
    }

}
