package taskOOP;

public class QuestionsAndAnswers {


    private String question;
    private String userInput;
    private String[] answer;


    public QuestionsAndAnswers(String question, String userInput, String[] answer) {
        this.question = question;
        this.userInput = userInput;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public String[] getAnswer() {
        return answer;
    }

    public void setAnswer(String[] answer) {
        this.answer = answer;
    }






}
