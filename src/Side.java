/**
 * @author Oscar Soto on 11/21/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
public enum Side {
    LEFT(2),
    RIGHT(1);

    private final int points;

    Side(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
