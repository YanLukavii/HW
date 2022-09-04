package taskException;

import java.io.FileWriter;
import java.io.IOException;

public class WriteUserInFile {

        public static void writeUserInput (String userInput, String filepath) throws IOException {

             try (FileWriter fileWriter = new FileWriter(filepath)) {
                     fileWriter.write(userInput);
             }
        }
}
