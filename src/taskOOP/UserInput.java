package taskOOP;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class UserInput {

    private Reader reader;

    UserInput () {}

    public UserInput(Reader reader) {
        this.reader = reader;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public static void main(String[] args) {
        UserInput userInput = new UserInput(new Reader("UserInput.txt"));

        System.out.println(Arrays.toString(userInput.getUsersAnswersAsArray()));

    }
    public String[] getUsersAnswersAsArray () {


        String fileStringFromInput = reader.getResultStringFromFile();

        String result = fileStringFromInput.replaceAll("(\r\n)"," ");

        return result.split(" ");
    }
}
