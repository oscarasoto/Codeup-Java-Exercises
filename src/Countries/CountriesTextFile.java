package Countries;

import InputOutput.File;
import InputOutput.Folder;
import java.io.IOException;
import java.util.List;

/**
 * @author oscarsoto on 12/5/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
class CountriesTextFile {

    private String folderName = "resources/countries";
    private String fileName = "countries.txt";

    List<String> readCountries() throws IOException {
        File<String> file = new File<>(new Folder(folderName), fileName);
        return file.readFromFile();
    }

    void writeCountries(List<String> countries) throws IOException {

        File<String> file = new File<>(new Folder(folderName), fileName);
        file.writeInFile(countries,true);

    }


}
