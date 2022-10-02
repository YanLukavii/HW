package taskPriceInWords.PriceInWords.tests.unit;

import taskPriceInWords.PriceInWords.Starter;
import taskPriceInWords.PriceInWords.service.PriceConverter;
import taskPriceInWords.PriceInWords.service.PrintPriceRus;
import taskPriceInWords.PriceInWords.wordsRepository.LanguageRusRepository;
import taskPriceInWords.assertions.Assertions;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StarterTest {


    public void testStarterWithNulls() {

        String scenario = "Тест при null в экземпляре Starter";

        try {
            PrintPriceRus printPriceRus = null;
            PriceConverter priceConverter = null;
            LanguageRusRepository languageRusRepository = null;

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(baos);
            PrintStream oldStream = System.out;
            System.setOut(printStream);

            new Starter(languageRusRepository, priceConverter, printPriceRus).start("123");

            System.out.flush();
            System.setOut(oldStream);
            String mess = String.valueOf(baos);

            Assertions.assertEqualsString("Какая-то логика при NULL\r\n", mess);
            System.out.println("Passed " + scenario);

        } catch (Throwable e) {

            System.err.println(scenario + " fails with massage " + e.getMessage());
        }
    }
}
