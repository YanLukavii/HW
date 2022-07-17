/*
Написать систему тестирования.
На экран выводится вопрос и варианты ответа, с клавиатуры вводится номер ответа.
Вопросы и ответы должны быть зашиты в коде, внешнего хранения в файлах или базах данных не нужно.
Должно быть три вопроса, каждый с 3-5 вариантами ответов.
Все вопросы с одним правильным вариантом ответа.
После прохождения теста отображается результат.
Использовать только циклы, массивы, условия и другие структуры, которые были пройдены на данный момент в рамках курса.
В этом задании не нужно использовать ООП (создавать классы), вопросы и варианты ответов надо хранить в массиве (массивах).
 */

import java.util.*;

public class TestWithThreeQuestions {

    public void threeQuestions() {

        Scanner sc = new Scanner(System.in);
        int a;
        int count = 0;

        String[] questions = {"Какое число плоское?)))))))", "Какой командой создать новую ветку в репозитории git?", "Какой командой синхронизироваться с удаленным репозиторием git?(вниз)"};
        String[] numbersFirstQuestion = {"1", "571", "383", "777"};
        String[] commandsSecondQuestion = {"git checkout", "git checkout -b", "git new branch", "git br", "git checkbranch"};
        String[] commandsThirdQuestion = {"git push", "git pull", "git up", "git down", "git synchronize down"};
        Object[] rightAnswers = {4, 2, 1}; // переделать всё(почти)
        Object[][] result = {numbersFirstQuestion, commandsSecondQuestion, commandsThirdQuestion, questions, rightAnswers};

        for (int i = 0; i < result[3].length; i++) {
            System.out.println(questions[i]);

            for (int j = 0; j < result[i].length; j++) {
                System.out.println("[" + (j + 1) + "] " + result[i][j]);
            }

            while (true) {                  // условие если текст
                if (sc.hasNextInt()) {
                    a = sc.nextInt();
                    if (a == (int) result[4][i]) {
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


    public String[] increasingTheSizeOfAnArray(String[] input, String inputString) { // добавление в массив еще одного элемента

        String[] str;
        str = Arrays.copyOf(input, input.length);
        str[input.length - 1] = inputString;

        return str;
    }


    public static void main(String[] args) {

        new TestWithThreeQuestions().threeQuestions();


    }
}
