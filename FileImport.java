import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileImport {
    public Scanner importFile(String fileAdress) throws IOException {

        File file = new File(fileAdress);
        return new Scanner(file);
    }
}

