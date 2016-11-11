import java.util.Scanner;

public class HelloWorld {

    // shortcut psvm
    public static void main(String[] args) {

        // Input from Console
        String userinput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something: ");
        userinput = sc.nextLine();
        System.out.println("You entered: " + userinput);
        /////////////////////////////

        // shortcut sout
        System.out.println("Hello world!!");

        System.out.println("Below I'm going to call a multiply method");

        int result = multiply(2, 3);

        System.out.println("2 multiplied by 3 is = " + result);

        int test;
        char initial = 's';
        System.out.println(initial);

        test = initial;

        System.out.println("Assigned a character to a variable that has been declared as an int = " + test);


    }

    public static int multiply (int a, int b) {
        return a * b;
    }
}
