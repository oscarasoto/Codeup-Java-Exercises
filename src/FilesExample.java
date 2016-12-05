/**
 * @author oscarsoto on 12/5/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class FilesExample {
    public static void main(String[] args) throws IOException {
        String folder = "resources/movies";
        Path folderPath = Paths.get(folder);
        if (Files.notExists(folderPath)) {
            Files.createDirectory(folderPath);
        }

        Path filePath = Paths.get(folder, "movies.txt");
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        // FileWriter -> BufferedWriter -> PrintWriter
        // try resources

        try (
                FileWriter fileWriter = new FileWriter(filePath.toFile());
                // to append write : new FileWriter(filePath.toFile(), true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter output = new PrintWriter(bufferedWriter)
        ) {
            String[] titles = {"Home", "The avengers", "It"};
            for (String title : titles) {
                output.println(title);
            }
        }

        // FileReader, BufferedReader

        List<Movie> movies = new ArrayList<>();

        try (
                FileReader fileReader = new FileReader(filePath.toFile());
                BufferedReader input = new BufferedReader(fileReader);
        ) {
            String line = input.readLine();
            while (line != null) {
                String[] movieData = line.split(",");
                // parsing
                movies.add(new Movie(
                        Integer.parseInt(movieData[0]),
                        movieData[1],
                        movieData[2]
                ));
                line = input.readLine();
            }
        }

        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}

class Movie {
    private int id;
    private String title;
    private String category;

    public Movie(int id, String title, String category) {
        this.id = id;
        this.title = title;
        this.category = category;
    }

    @Override
    public String toString() {
        return id + ") The movie " + title + " is in the " + category + " category";
    }
}