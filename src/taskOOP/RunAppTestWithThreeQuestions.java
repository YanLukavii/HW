package taskOOP;


import java.io.*;

public class RunAppTestWithThreeQuestions {

    public static void main(String[] args)  {


        new Game().start((new QuestionsAndAnswers(new ReaderQuestions(new Reader("QuestionsAndAnswers.txt")))),
                new UserInputValue(new ReaderUserInput(new Reader("UserInput.txt"))));

        Reader reader1 = new Reader("QuestionsAndAnswers.txt");
        Reader reader2 = new Reader("UserInput.txt");

      //  Save.saveObject(reader2, );
     //   Reader reader5 = (Reader) Load.load();
       // System.out.println(reader5.getFilePath());


    }
}
