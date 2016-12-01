package movieList;

/**
 * @author Oscar Soto on 11/30/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
enum Category {
    animated,
    drama,
    horror,
    scifi,
    musical,
    comedy;

    public static Category fromNumber(int number){
        return Category.values()[number-1];
    }
}
