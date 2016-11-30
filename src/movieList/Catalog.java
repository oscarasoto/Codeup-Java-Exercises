package movieList;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Movie> movies;
    public Catalog(List<Movie> movies) {
        this.movies = movies;
    }

    List<Movie> suggestMoviesIn(Category category) {

        List<Movie> userMovieSuggestions = new ArrayList<>();

        for (Movie movie : movies) {
            if (category.equals(movie.getCategory())) {
                userMovieSuggestions.add(movie);
            }
        }

        return userMovieSuggestions;

    }
}