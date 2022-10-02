package taskPriceInWords.PriceInWords;

import taskPriceInWords.PriceInWords.service.PriceConverter;
import taskPriceInWords.PriceInWords.service.PrintPrice;
import taskPriceInWords.PriceInWords.service.PrintPriceRus;
import taskPriceInWords.PriceInWords.wordsRepository.LanguageRusRepository;
import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        LanguageRusRepository lrr = new LanguageRusRepository("числа.txt");
        PriceConverter priceConverter = new PriceConverter();
        PrintPrice printPrice = new PrintPriceRus();
        Starter starter = new Starter(lrr, priceConverter, printPrice);

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String tmp = scanner.nextLine();
            if (tmp.equals("end")) {
                scanner.close();
                return;
            }
            starter.start(tmp);

        }

    }
}
