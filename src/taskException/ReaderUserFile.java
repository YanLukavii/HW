package taskException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderUserFile {

        public static String readFile (String filePath) {

            try (FileReader fileReader = new FileReader(filePath);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                return String.valueOf(bufferedReader.readLine());

            } catch (IOException e) {

                return e.getMessage();
            }
        }
}
