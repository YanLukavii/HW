package taskOOP;

import java.util.Arrays;

public class ReaderUserInput {

    private Reader reader;

    ReaderUserInput() {}

    public ReaderUserInput(Reader reader) {
        this.reader = reader;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public static void main(String[] args) {
        ReaderUserInput userInput = new ReaderUserInput(new Reader("UserInput.txt"));

        System.out.println(Arrays.toString(userInput.getUsersAnswersAsArray()));

    }
    public String[] getUsersAnswersAsArray () {


        String fileStringFromInput = reader.getResultStringFromFile();

        String result = fileStringFromInput.replaceAll("(\r\n)"," ");

        return result.split(" ");
    }
}
