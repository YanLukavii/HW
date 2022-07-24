package taskOOP;


public class Game {


    private static final QuestionsAndAnswers QUESTIONS_AND_ANSWERS = new QuestionsAndAnswers(new ReaderQuestions(new Reader("QuestionsAndAnswers.txt")));
    private static final UserInputValue USER_INPUT_VALUE = new UserInputValue(new ReaderUserInput(new Reader("UserInput.txt")));

    public static void start() {

        TestElement tmpQuestionsAndAnswer;

        for (int i = 1; i <= 3; i++) {

            tmpQuestionsAndAnswer = new TestElement(i, QUESTIONS_AND_ANSWERS);

            String question = tmpQuestionsAndAnswer.getQuestion();
            String[] option = tmpQuestionsAndAnswer.getOptions();
            String rightAnswer = tmpQuestionsAndAnswer.getRightAnswer();

            String userInput = USER_INPUT_VALUE.getUserInput(i);

            System.out.println(question);

            for (int j = 0; j < option.length; j++) {

                System.out.println("[" + (j + 1) + "] " + option[j]);

            }
            System.out.println("Вы ввели: " + userInput);

            if (userInput.equals(rightAnswer)) {
                System.out.println("ПРАВИЛЬНО!");
            } else {
                System.out.println("Не верно, правильный ответ: " + rightAnswer);
            }
            System.out.println("----------------------------------------------");

        }

    }

}
