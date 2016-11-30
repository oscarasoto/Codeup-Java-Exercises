package movies;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oscar Soto on 11/30/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
public class Rental {
    private List<Double> prices = new ArrayList<>();

    public void addRent(double price) {
        prices.add(price);
    }

    public int moviesRentedCount() {
        return prices.size();
    }

    public double totalPrice() {
        double totalPrice = 0;
        for (double price:  prices) {
            totalPrice += price;
        }
        return totalPrice;
    }
}
