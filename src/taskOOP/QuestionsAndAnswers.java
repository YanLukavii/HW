package taskOOP;

public class QuestionsAndAnswers {

    private String[] question;
    private String[] answer;


    public QuestionsAndAnswers(ReaderQuestions questions) {
        this.question = questions.getQuestionsArray();
        this.answer = questions.getRightAnswersArray();
    }


    public String[] getQuestion() {
        return question;
    }

    public String[] getAnswer() {
        return answer;
    }
}
