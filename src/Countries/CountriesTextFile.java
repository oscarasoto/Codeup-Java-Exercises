package Countries;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author oscarsoto on 12/5/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
class CountriesTextFile {

    private String folderName = "resources/countries";

    List<String> readCountries() throws IOException {
        List<String> countries = new ArrayList<>();
        Path filePath = verifyFilePath();

        try (
                FileReader fileReader = new FileReader(filePath.toFile());
                BufferedReader input = new BufferedReader(fileReader)
        ) {
            String line = input.readLine();

            while (line != null) {
                countries.add(line);
                line = input.readLine();
            }
        }

        return countries;
    }

    void writeCountries(List<String> countries) throws IOException {

        verifyFolderPath();
        Path filePath = verifyFilePath();

        // FileWriter -> BufferedWriter -> PrintWriter

        try (
                FileWriter fileWriter = new FileWriter(filePath.toFile(), true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter output = new PrintWriter(bufferedWriter)
        ) {

            for (String country : countries) {
                output.println(country);
            }
        }
    }

    private Path verifyFilePath() throws IOException {
        String fileName = "countries.txt";
        Path filePath = Paths.get(folderName, fileName);
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }
        return filePath;
    }

    private void verifyFolderPath() throws IOException {
        Path folderPath = Paths.get(folderName);
        if (Files.notExists(folderPath)) {
            Files.createDirectory(folderPath);
        }
    }
}
