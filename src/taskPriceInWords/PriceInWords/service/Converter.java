package taskPriceInWords.PriceInWords.service;

import java.util.HashMap;

public interface Converter {

    String convert(String input, HashMap<Integer, String> wordsMap);

}
