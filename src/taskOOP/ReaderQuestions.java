package taskOOP;

import java.io.File;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class ReaderQuestions {

    private Reader reader;

    public ReaderQuestions(Reader reader) {
        this.reader = reader;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public String[] getQuestionAnswersArray() {

        String fileAsAString = reader.getResultStringFromFile();

        String res1 = fileAsAString.replaceAll("(\r\n)", " ");
        String res2 = res1.replaceAll("(\\p{Alpha})", "");
        String res3 = res2.replaceAll(" ", "");
        String res4 = res3.replaceFirst("-", "");

        return res4.split("-");
    }


    public String[] getQuestionsArray() {

        String fileAsAString = reader.getResultStringFromFile();
        String res1 = fileAsAString.replaceAll(("\\d"),"");
        String res2 = res1.replaceAll("()","");
        System.out.println(res2);



        return null;
    }

    public static void main(String[] args) {

        ReaderQuestions readerQuestions = new ReaderQuestions(new Reader("QuestionsAndAnswers.txt"));
        System.out.println(Arrays.toString(readerQuestions.getQuestionsArray()));

    }


}
