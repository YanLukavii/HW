package taskOOP;

public class UserInputValue {

    private final String[] userAnswers;

    UserInputValue ( ReaderUserInput readerUserInput ) {

        this.userAnswers = readerUserInput.getUsersAnswersAsArray();

    }

    public String getUserInput (int number) {
        String tmp = "";
        for (int i = 0; i < number; i++) {

            tmp = userAnswers[i];
        }

        return tmp;
    }

    public static void main(String[] args) {
        UserInputValue userInputValue = new UserInputValue(new ReaderUserInput(new Reader("UserInput.txt")));

        System.out.println(userInputValue.getUserInput(1));
    }

}
