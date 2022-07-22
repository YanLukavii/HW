package taskTestSystem;

import java.util.Arrays;
import java.util.Scanner;

public class TestWithThreeQuestionsEnum {

    enum RightAnswers { //енам с ответами

        FIRST(4),
        SECOND(2),
        THIRD(1);

        private final int rightNumber;

        RightAnswers(int rightNumber) {
            this.rightNumber = rightNumber;
        }

        public int getRightNumber() {
            return rightNumber;
        }
    }

    public static void main(String[] args) {

       // new taskTestSystem.TestWithThreeQuestionsEnum().threeQuestions();
        String[] questions = {"Какое число плоское?)))))))", "Какой командой создать новую ветку в репозитории git?", "Какой командой синхронизироваться с удаленным репозиторием git?(вниз)"};
        String[] res = increasingTheSizeOfAnArray(questions,"другалёк");
        System.out.println(Arrays.toString(res));

    }

    public void threeQuestions() {

        Scanner sc = new Scanner(System.in);
        //NIO СЧИТЫВАНИЕ
        // ФАЙЛ С ВОПРОСАМИ И ОТВЕТАМИ  (СДЕЛАТЬ ЧЕРЕЗ СЕРИАЛИЗАЦИЮ (ПРИДУМАТЬ КАК))
        //ОТДЕЛЬНЫЙ ФАЙЛ С ОТВЕТАМИ ПОЛЬЗОВАТЕЛЯ

        int a;
        int count = 0;

        String[] questions = {"Какое число плоское?)))))))", "Какой командой создать новую ветку в репозитории git?", "Какой командой синхронизироваться с удаленным репозиторием git?(вниз)"};
        String[] numbersFirstQuestion = {"1", "571", "383", "777"};
        String[] commandsSecondQuestion = {"git checkout", "git checkout -b", "git new branch", "git br", "git checkbranch"};
        String[] commandsThirdQuestion = {"git push", "git pull", "git up", "git down", "git synchronize down"};
        RightAnswers[] rightAnswers = RightAnswers.values();
        Object[][] result = {numbersFirstQuestion, commandsSecondQuestion, commandsThirdQuestion, questions, rightAnswers};

        for (int i = 0; i < result[3].length; i++) {
            System.out.println(questions[i]);

            for (int j = 0; j < result[i].length; j++) {
                System.out.println("[" + (j + 1) + "] " + result[i][j]);
            }

            while (true) {
                if (sc.hasNextInt()) {
                    a = sc.nextInt();
                    RightAnswers rs = (RightAnswers) result[4][i];
                    if (a == rs.getRightNumber()) {
                        count++;
                    }

                    break;
                } else {
                    System.out.println("ЧТО ЭТО?");
                    sc = new Scanner(System.in);
                }
            }
        }
        sc.close();
        if (count == 3) {
            System.out.println("Все верно - ваш результат " + count + "/" + 3);
        } else System.out.println("Плачевно - ваш результат " + count + "/" + 3);
    }


    public static String[] increasingTheSizeOfAnArray(String[] input, String inputString) {

        String[] str;
        str = Arrays.copyOf(input, input.length + 1);
        str[input.length] = inputString;

        return str;
    }
}
