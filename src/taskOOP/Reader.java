package taskOOP;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reader {

    private String filePath;

    public Reader(String filePath) {
        this.filePath = filePath;
    }

    public Reader() {

    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getResultStringFromFile() {

        String result = "";
        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get(getFilePath()))) {
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());

            for (int i = 0; i < channel.size(); i++) {
                result = result + (char) buffer.get(i);

            }
        } catch (IOException e) {
            System.out.println("Другалёк??? Че с файликом?");
        }

        return result;
    }
}
