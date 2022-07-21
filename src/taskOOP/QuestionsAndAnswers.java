package taskOOP;

import java.util.Arrays;

public class QuestionsAndAnswers {

    private final String[] questions;
    private final String[] answer;


    public QuestionsAndAnswers(ReaderQuestions questions) {
        this.questions = questions.getQuestionsArray();
        this.answer = questions.getRightAnswersArray();

    }

    public String[] getQuestions() {
        return questions;
    }

    public String getQuestion(int number) {
        String tmp = "";
        for (int i = 0; i < number; i++) {

            tmp = questions[i];
        }
        String[] res = tmp.split("\\R");

        return res[0];

    }

    public String getRightAnswer(int number) {
        String tmp = "";
        for (int i = 0; i < number; i++) {

            tmp = answer[i];
        }

        return tmp;
    }

    public String[] getOptions(int number) {
        String tmp = "";
        for (int i = 0; i < number; i++) {

            tmp = questions[i];
        }

        String[] res = tmp.split("\\R");

        return Arrays.copyOfRange(res, 1, res.length);

    }

    public static void main(String[] args) {

        QuestionsAndAnswers questionsAndAnswers = new QuestionsAndAnswers(new ReaderQuestions(new Reader("QuestionsAndAnswers.txt")));
        System.out.println(questionsAndAnswers.getQuestion(3));
        System.out.println(Arrays.toString(questionsAndAnswers.getOptions(3)));
        System.out.println(questionsAndAnswers.getRightAnswer(3));

    }
}
