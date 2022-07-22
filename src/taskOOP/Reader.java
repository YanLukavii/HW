package taskOOP;


import java.io.IOException;
import java.io.Serializable;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reader implements Serializable {

    private final String filePath;

    public Reader(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getResultStringFromFile() {

        String result = "";
        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get(getFilePath()))) {

            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());

            for (int i = 0; i < channel.size(); i++) {
                result = result + (char) buffer.get(i);

            }
        } catch (IOException e) {
            System.out.println("Другалёк!??? Что-то с файликом!");
        }


        return result;
    }
}
