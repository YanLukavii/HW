package taskOOP;

import java.util.Arrays;

public class ReaderUserInput {

    private final Reader reader;

    public ReaderUserInput(Reader reader) {
        this.reader = reader;
    }

    public String[] getUsersAnswersAsArray () {


        String fileStringFromInput = reader.getResultStringFromFile();

        String result = fileStringFromInput.replaceAll("(\r\n)"," ");

        return result.split(" ");
    }
}
