package taskPriceInWords.PriceInWords.wordsRepository;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class LanguageRusRepository implements LanguageRepository{

    String filePath;

    public LanguageRusRepository(String filePath) {
        this.filePath = filePath;
    }

    public  HashMap<Integer, String> getHashmap()  {

        HashMap<Integer, String> map = new HashMap<>();

        try {
            FileReader fr = new FileReader(this.filePath);
            Scanner scanner = new Scanner(fr);
            String text;
            String[] temp;
            while (scanner.hasNextLine()) {

                text = scanner.nextLine();
                temp = text.split(" - ");
                map.put(Integer.parseInt(temp[0]), temp[1]);

            }
            scanner.close();
            fr.close();
            return map;

        }  catch (IOException exception) {
            System.out.println("Нет файла с числами у тебя 10 секунд чтоб его добавить!");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.getHashmap();
        }
      return null;
    }
}
