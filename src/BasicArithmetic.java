
public class BasicArithmetic {
    public static void main(String[] args) {
        int firstNumber = 20;
        int secondNumber = 10;
        System.out.println(addition(firstNumber, secondNumber));
        System.out.println(substraction(firstNumber, secondNumber));
        System.out.println(multiplication(firstNumber, secondNumber));
        System.out.println(division(firstNumber, secondNumber));

    }

    private static int addition (int numberA, int numberB){
        return numberA + numberB;
    }

    private static int substraction (int numberA, int numberB){
        return numberA - numberB;
    }

    private static int multiplication (int numberA, int numberB){
        return numberA * numberB;
    }

    private static int division (int numberA, int numberB){
        return numberA / numberB;
    }

}
