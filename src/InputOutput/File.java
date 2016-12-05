package InputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author oscarsoto on 12/5/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */

public class File {
    private Path filePath;

    public File (String folderName, String fileName) throws IOException {
       this.filePath = Paths.get(folderName, fileName);

        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

    }

    private void writeInFile (List<String> data, boolean append) throws IOException {
        // FileWriter -> BufferedWriter -> PrintWriter

        try (
                FileWriter fileWriter = new FileWriter(filePath.toFile(), append);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter output = new PrintWriter(bufferedWriter)
        ) {

            for (String info : data) {
                output.println(info);
            }
        }
    }

}
