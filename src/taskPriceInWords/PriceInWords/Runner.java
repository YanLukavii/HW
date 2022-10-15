package taskPriceInWords.PriceInWords;

import taskPriceInWords.PriceInWords.service.*;
import taskPriceInWords.PriceInWords.wordsRepository.LanguageRusRepository;
import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        LanguageRusRepository lrr = new LanguageRusRepository("числа.txt");
        PriceConverter priceConverter = new PriceConverter();
        PrintPrice printPrice = new PrintPriceDefault();
        Case casePrice = new CaseRub();

        Starter starter = new Starter(lrr, priceConverter, printPrice);

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String tmp = scanner.nextLine();
            String casRub = casePrice.getPriceDescription(tmp);
            if (tmp.equals("end")) {
                scanner.close();
                return;
            }
            starter.start(tmp,casRub);

        }

    }
}
