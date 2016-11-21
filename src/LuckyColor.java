import java.util.Scanner;

/**
 * @author Oscar Soto on 11/21/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
public class LuckyColor {
    public static void main(String[] args) {
        String isThereAnotherCustomer;
        Scanner sc = new Scanner(System.in);
        double total;

        System.out.println("Welcome to Lucky Color Discount");

        do {

            total = applyDiscount(originalCustomerAmount());
            System.out.println("The amount you need to pay after discount is = " + "\"" + total + "\"");

            System.out.println("Do you want to continue yes/no");
            isThereAnotherCustomer = sc.nextLine();

        } while (isThereAnotherCustomer.equalsIgnoreCase("yes"));


        sc.close();
        System.out.println("Thanks for playing!!");
    }

    private static double originalCustomerAmount(){
        Scanner originalAmount = new Scanner(System.in);
        System.out.println("What is your original amount to pay?");
        return originalAmount.nextDouble();

    }

    private static Color getCustomerLuckyColor() {
        int luckyNumber = (int) Math.floor((Math.random() * 5) + 1);
        return Color.values()[luckyNumber];
    }

    private static Double applyDiscount(double originalAmount) {
        Color customerColor = getCustomerLuckyColor();
        return customerColor.applyDiscount(originalAmount);

    }


}
