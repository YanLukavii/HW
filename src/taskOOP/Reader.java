package taskOOP;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reader implements Serializable {

    private final String filePath;

    public Reader(String filePath) {
        this.filePath = filePath;
    }

    public String getResultStringFromFile() {


        byte[] buffer = new byte[0];
        try {
            buffer = Files.readAllBytes(Paths.get(filePath));
        } catch (IOException e) {
            System.out.println("Другалёк!??? Что-то с файликом!");

        }

        return new String(buffer, StandardCharsets.ISO_8859_1);
    }
}
