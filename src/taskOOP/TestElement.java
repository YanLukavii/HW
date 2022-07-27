package taskOOP;

import java.io.Serializable;

public class TestElement implements Serializable {

    private final int numberOfQuestion;
    private final String question;
    private final String[] options;
    private final String rightAnswer;


    public TestElement(int numberOfQuestion, QuestionsAndAnswers questionsAndAnswers) {
        this.numberOfQuestion = numberOfQuestion;
        this.question = questionsAndAnswers.getQuestion(numberOfQuestion);
        this.options = questionsAndAnswers.getOptions(numberOfQuestion);
        this.rightAnswer = questionsAndAnswers.getRightAnswer(numberOfQuestion);
    }

    public int getNumberOfQuestion() {
        return numberOfQuestion;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

}
