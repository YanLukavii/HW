package taskPriceInWords.PriceInWords;

import taskPriceInWords.PriceInWords.service.Case;
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

        if (languageRepository == null || converter == null || pintPrice == null) {

            throw new NullPointerException("Ошибка! null в конструкторе Starter");
        }

    }

    public void start(String input, String casePrice) {

        String convertedInput = converter.convert(input,languageRepository.getHashmap());

        pintPrice.print(convertedInput, casePrice);

    }

}
