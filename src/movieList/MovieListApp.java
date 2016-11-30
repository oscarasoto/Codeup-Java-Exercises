package movieList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * When the user enters a category, the program reads through all of the movies in the ArrayList and display
 * a line for any movie whose category matches the category entered by the user.
 *
 * @author Oscar Soto on 11/30/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
public class MovieListApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        List<Movie> userMovieList;

        System.out.println("Welcome to the Movies Application");

        do {

            userMovieList = getUserSelection();

            showMovieSuggestions(userMovieList);

            System.out.println("Do you want to generate another list (y/n) ?");

        } while ("y".equalsIgnoreCase(input.next()));

    }

    private static List<Movie> getUserSelection() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        List<Movie> userMovieList = new ArrayList<>();
        int userSelection;

        System.out.println("1 - Animated");
        System.out.println("2 - Drama");
        System.out.println("3 - Horror");
        System.out.println("4 - Sci-Fi");
        System.out.println("Select a category from the list by number:");
        userSelection = input.nextInt();

        switch (userSelection) {
            case 1:
                userMovieList = generateMovieSuggestions("animated");
                break;
            case 2:
                userMovieList = generateMovieSuggestions("drama");
                break;
            case 3:
                userMovieList = generateMovieSuggestions("horror");
                break;
            case 4:
                userMovieList = generateMovieSuggestions("scifi");
                break;
            default:
                System.out.println("Sorry we don't have a movie of that category");

        }
        return userMovieList;
    }

    private static List<Movie> generateMovieSuggestions(String category) {
        List<Movie> moviesFullList = getMovies();
        List<Movie> userMovieSuggestions = new ArrayList<>();

        for(Movie movie: moviesFullList){
            if (category.equalsIgnoreCase(movie.getCategory())){
                userMovieSuggestions.add(movie);
            }
        }

        return userMovieSuggestions;

    }

    private static void showMovieSuggestions(List<Movie> userMovieSuggestions) {
        for(Movie movie: userMovieSuggestions){
            System.out.println("Title: " + movie.getTitle() + " == Category: " + movie.getCategory());
            System.out.println("-------------------------------------------------------------------");
        }
    }

    private static List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();

        for(int i = 1; i <=100; i++){
            movies.add(MovieIO.getMovie(i));
        }

        return movies;
    }


}
