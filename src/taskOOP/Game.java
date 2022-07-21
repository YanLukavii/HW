package taskOOP;

import java.util.Arrays;

public class Game {

    public void start (QuestionsAndAnswers questionsAndAnswers, UserInputValue userInputValue) {

        for (int i = 1; i < questionsAndAnswers.getQuestions().length+1; i++) {
                String question = questionsAndAnswers.getQuestion(i);
                String[] option =  questionsAndAnswers.getOptions(i);
                String userInput = userInputValue.getUserInput(i);
                String rightAnswer = questionsAndAnswers.getRightAnswer(i);

            System.out.println(question);
            System.out.println(Arrays.toString(option));
            System.out.println(userInput);
           // System.out.println(rightAnswer);
            if(userInput.equals(rightAnswer)) {
                System.out.println("ПРАВИЛЬНО!");
            }else  {
            System.out.println("НУ чТО Ты ДРУГАЛЁК правильный ответ: " + rightAnswer);}
            System.out.println("----------------------------------------------");

        }

    }

    public static void main(String[] args) {

        new Game().start((new QuestionsAndAnswers(new ReaderQuestions(new Reader("QuestionsAndAnswers.txt")))),new UserInputValue(new ReaderUserInput(new Reader("UserInput.txt"))));
    }



}
