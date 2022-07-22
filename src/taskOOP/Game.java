package taskOOP;


public class Game {

    public void start(QuestionsAndAnswers questionsAndAnswers, UserInputValue userInputValue) {

        for (int i = 1; i <= questionsAndAnswers.getQuestions().length; i++) {

            String question = questionsAndAnswers.getQuestion(i);
            String[] option = questionsAndAnswers.getOptions(i);
            String userInput = userInputValue.getUserInput(i);
            String rightAnswer = questionsAndAnswers.getRightAnswer(i);

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
