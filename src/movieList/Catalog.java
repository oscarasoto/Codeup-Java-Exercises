package movieList;

import java.util.ArrayList;
import java.util.List;

class Catalog {
    private List<Movie> movies;

//    Catalog(List<Movie> movies) {
//        this.movies = movies;
//    }

    List<Movie> suggestMoviesIn(Category category) {

        List<Movie> userMovieSuggestions = new ArrayList<>();

        for (Movie movie : movies) {
            if (category.equals(movie.getCategory())) {
                userMovieSuggestions.add(movie);
            }
        }

        return userMovieSuggestions;

    }

    static Catalog populate() {
        Catalog catalog = new Catalog();
        catalog.movies = new ArrayList<>();

        for(int i = 1; i <=100; i++){
            catalog.movies.add(MovieIO.getMovie(i));
        }

        return catalog;
    }
}