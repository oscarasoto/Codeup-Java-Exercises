package movieList;

/**
 * @author Oscar Soto on 11/30/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
class Movie {
    String getTitle() {
        return title;
    }

    String getCategory() {
        return category;
    }

    private String title;
    private String category;

    Movie (String title, String category){
        this.title = title;
        this.category = category;
    }


}
