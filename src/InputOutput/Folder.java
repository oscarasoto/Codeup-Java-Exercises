package InputOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author oscarsoto on 12/5/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
public class Folder {
    String folderName;

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void createIfNotExists() throws IOException {
        Path folderPath = Paths.get(folderName);
        if (Files.notExists(folderPath)) {
            Files.createDirectory(folderPath);
        }
    }

    public String getPath() {
        return folderName;
    }
}
