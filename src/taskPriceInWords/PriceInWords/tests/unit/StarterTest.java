package taskPriceInWords.PriceInWords.tests.unit;

import taskPriceInWords.PriceInWords.Starter;
import taskPriceInWords.PriceInWords.service.Case;
import taskPriceInWords.PriceInWords.service.CaseRub;
import taskPriceInWords.PriceInWords.service.PriceConverter;
import taskPriceInWords.PriceInWords.service.PrintPriceDefault;
import taskPriceInWords.PriceInWords.wordsRepository.LanguageRusRepository;
import taskPriceInWords.assertions.Assertions;


public class StarterTest {


    public void testStarterWithNulls() {

        String scenario = "Тест при null в полях экземпляра Starter";

        try {
            PrintPriceDefault printPriceDefault = null;
            PriceConverter priceConverter = null;
            LanguageRusRepository languageRusRepository = null;
            Case caseRub = new CaseRub();

            new Starter(languageRusRepository, priceConverter, printPriceDefault).start("123", caseRub.getPriceDescription("123"));

        } catch (NullPointerException e) {
            try {
                Assertions.assertEqualsString("Ошибка! null в конструкторе Starter", e.getMessage());
                System.out.println("Passed " + scenario);
            } catch (Throwable b) {
                System.err.println(scenario + " fails with massage " + b.getMessage());
            }

        } catch (Throwable e) {

            System.err.println(scenario + " fails with massage " + e.getMessage());
        }
    }
}
