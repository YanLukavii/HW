package taskOOP;

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

    public String[] getRightAnswersArray() {

        String fileAsAString = reader.getResultStringFromFile();

        String res1 = fileAsAString.replaceAll("(\r\n)", " ");
        String res2 = res1.replaceAll("(\\p{Alpha})", "");
        String res3 = res2.replaceAll(" ", "");
        String res4 = res3.replaceFirst("-", "");

        return res4.split("-");
    }
    public String[] getQuestionsArray() { //возвращает массив c вариантами ответов

        String fileAsAString = reader.getResultStringFromFile();
        String res1 = fileAsAString.replaceAll("\\d\\R", "");
        String[] res2 = res1.split("(-)", 0);
        String[] result = new String[res2.length - 1];

        for (int i = 0; i < res2.length-1; i++) {

            result[i] = res2[i];

        }
        return result;
    }
  /*  public String[] getQuestionsArray() { //возвращает массив с вопросом и вариантами ответов

        String fileAsAString = reader.getResultStringFromFile();
        String res1 = fileAsAString.replaceAll("\\d\\r\\n","");
        String[] res2 = res1.split("(-)",0);

        String[] result = new String[res2.length - 1];
        for (int i = 0; i < result.length; i++) {

            char[] tmp = res2[i].toCharArray();
            String questionStr = "";
            for (int j = 0; j < tmp.length; j++) {

                if (tmp[j] == '\n') {

                    break;
                }
                questionStr = questionStr + tmp[j];

            }
            result[i] = questionStr.replaceAll("\r","");
        }

        return  result;
    }
 */




    public static void main(String[] args) {

        ReaderQuestions readerQuestions = new ReaderQuestions(new Reader("QuestionsAndAnswers.txt"));
        String[] test = readerQuestions.getQuestionsArray();
      //  System.out.println(test[2]);
        System.out.println(Arrays.toString(test));

    }


}
