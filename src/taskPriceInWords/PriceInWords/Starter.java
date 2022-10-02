package taskPriceInWords.PriceInWords;

import taskPriceInWords.PriceInWords.service.Converter;
import taskPriceInWords.PriceInWords.service.PrintPrice;
import taskPriceInWords.PriceInWords.wordsRepository.LanguageRepository;

public class Starter {

    private final LanguageRepository languageRepository;
    private final Converter converter;
    private final PrintPrice pintPrice;


    public Starter(LanguageRepository languageRepository, Converter converter, PrintPrice pintPrice) {
        this.languageRepository = languageRepository;
        this.converter = converter;
        this.pintPrice = pintPrice;
    }

    public void start(String input) {

        if (languageRepository == null || converter == null || pintPrice == null) {
            System.out.println("Какая-то логика при NULL");
            return;
        }

        pintPrice.print(input, converter.convert(input, languageRepository.getHashmap()));

    }

}
