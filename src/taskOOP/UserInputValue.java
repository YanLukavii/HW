package taskOOP;

public class UserInputValue {

   // ReaderUserInput readerUserInput;
    private String[] userAnswers;

    UserInputValue ( ReaderUserInput readerUserInput ) {

        this.userAnswers = readerUserInput.getUsersAnswersAsArray();

    }

    public String[] getUserAnswers() {
        return userAnswers;
    }

}
