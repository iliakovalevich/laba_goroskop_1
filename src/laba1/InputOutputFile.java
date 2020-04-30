package laba1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputOutputFile {
    protected ArrayList readTxtFile(String pathname) throws FileNotFoundException {
        Scanner content = new Scanner(new File(pathname));
        ArrayList<String> forecastsList = new ArrayList<String>();
        while (content.hasNextLine()){
            forecastsList.add(content.nextLine());
        }
        return forecastsList;
    }
}
