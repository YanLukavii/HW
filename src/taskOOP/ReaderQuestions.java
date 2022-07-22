package taskOOP;


public class ReaderQuestions {

    private final Reader reader;

    public ReaderQuestions(Reader reader) {
        this.reader = reader;
    }

    public String[] getRightAnswersArray() {

        String fileAsAString = reader.getResultStringFromFile();

        String res1 = fileAsAString.replaceAll("(\\R)", " ");
        String res2 = res1.replaceAll("(\\p{Alpha})", "");
        String res3 = res2.replaceAll(" ", "");
        String res4 = res3.replaceFirst("-", "");
        String res5 = res4.replaceAll("[?]", "");

        return res5.split("-");
    }

    public String[] getQuestionsArray() {

        String fileAsAString = reader.getResultStringFromFile();
        String res1 = fileAsAString.replaceAll("\\d\\R", "");
        String[] res2 = res1.split("(-)", 0);
        String[] result = new String[res2.length - 1];

        for (int i = 0; i < res2.length - 1; i++) {

            result[i] = res2[i];

        }
        return result;
    }
}
