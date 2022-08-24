package taskException;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class WriteUserInFile {

        public static void writeUserInput (String userInput, String filepath) throws IOException {

             try (FileWriter fileWriter = new FileWriter(filepath)) {
                     fileWriter.write(userInput);
             }
        }
}
