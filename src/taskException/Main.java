package taskException;


/*      Придумать несколько взаимосвязанных классов,
        в которых можно использовать три способа обработки исключений (вывод ошибки, rethrow и еще один, на выбор)
        А так же использована конструкция try-with-resource
        Вместо обращения к реальным ресурсам можно использовать классы-заглушки
        Результатом выполнения задания является код на гитхабе оформленный в виде pull request.*/

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        User user = new User(1);

        WriteUserInFile.writeUserInput(null,"file.txt");// Rethrow на метод main (метод должен записывать входящую строку в файл), ловим NPE

        System.out.println(ReaderUserFile.readFile("vcxvc")); //Обработка в методе (Читаем из не существующего файла ловим чекд исключение в методе readFile), FNFE

        WriteUserInFile.writeUserInput(user.readName(),"file.txt"); //Обраотка в методе, бросасем рантайм исключение

        user.setAge(-1);// отказ от ответственности , checked --> unchecked




















    }
}
