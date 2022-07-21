package taskOOP;

import java.util.Arrays;

public class RunAppTestWithThreeQuestions {

    public static void main(String[] args) {

       UserInputValue  userInputValue =  new UserInputValue(new ReaderUserInput(new Reader("UserInput.txt")));
        System.out.println(Arrays.toString(userInputValue.getUserAnswers()));

    }
}
