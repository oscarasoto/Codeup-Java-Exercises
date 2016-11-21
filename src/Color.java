/**
 * @author Oscar Soto on 11/21/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
public enum Color {
    RED(1),
    BLUE(.90),
    YELLOW(.75),
    GREEN(.65),
    PURPLE(.50),
    PINK(0);

    private final double discountPercentage;

    Color(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double applyDiscount(double payment){
        return discountPercentage * payment;
    }
}
