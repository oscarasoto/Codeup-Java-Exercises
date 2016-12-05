package InputOutput;

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

public class File<T> {
    private Path filePath;

    public File (Folder folder, String fileName) throws IOException {
        folder.createIfNotExists();

       this.filePath = Paths.get(folder.getPath(), fileName);
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }
    }

    public void writeInFile (List<T> data, boolean append) throws IOException {

        // FileWriter -> BufferedWriter -> PrintWriter
        try (
                FileWriter fileWriter = new FileWriter(filePath.toFile(), append);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter output = new PrintWriter(bufferedWriter)
        ) {

            for (T info : data) {
                output.println(info);
            }
        }
    }

    public List<T> readFromFile () throws IOException {
        List<T> data = new ArrayList<T>();
        try (
                FileReader fileReader = new FileReader(filePath.toFile());
                BufferedReader input = new BufferedReader(fileReader)
        ) {
            String line = input.readLine();
            while (line != null) {
                data.add((T) line);
                line = input.readLine();
            }
        }
        return data;
    }

}
