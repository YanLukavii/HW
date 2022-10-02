package taskPriceInWords.PriceInWords.tests.unit;

import taskPriceInWords.PriceInWords.service.PriceConverter;
import taskPriceInWords.PriceInWords.wordsRepository.LanguageRusRepository;
import taskPriceInWords.assertions.Assertions;
import java.util.HashMap;

public class PriceConverterTest {

    public void testValidValueOutput() {
        String scenario = "Тест на правильную конвертицию числа в текст ";

        try {
            PriceConverter converter = new PriceConverter();
            LanguageRusRepository languageRusRepository = new LanguageRusRepository("числа.txt");
            String testInputValue = "123";
            String price = converter.convert(testInputValue, languageRusRepository.getHashmap());
            Assertions.assertEqualsString("сто двадцать три", price);
            System.out.println("Passed " + scenario);

        } catch (Throwable e) {
            System.err.println(scenario + " fails with massage " + e.getMessage());
        }

    }

    public void testValidValueOutputUsingListFromZeroToTwenty() {

        String scenario = "Тест на правильную конвертицию числа в текст используя список c числами от [0 - 20]";

        try {
            PriceConverter converter = new PriceConverter();
            LanguageRusRepository languageRusRepository = new LanguageRusRepository("числа.txt");
            HashMap<Integer, String> list = languageRusRepository.getHashmap();
            String expectedOutputValue;

            for (int i = 0; i < 21; i++) {
                expectedOutputValue = list.get(i);

                String price = converter.convert(String.valueOf(i), list);
                Assertions.assertEqualsString(expectedOutputValue, price);
                System.out.println("Passed " + scenario + " " + i);

            }

        } catch (Throwable e) {
            System.err.println(scenario + " fails with massage " + e.getMessage());
        }

    }


}
