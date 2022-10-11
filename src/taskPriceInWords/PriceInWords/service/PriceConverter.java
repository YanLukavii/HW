package taskPriceInWords.PriceInWords.service;

import java.util.HashMap;

public class PriceConverter implements Converter {

    public PriceConverter() {

    }

    @Override
    public String convert(String input, HashMap<Integer, String> wordsMap) {

        int inputLength = input.length();

        int inputPrice;
        try {
            if (inputLength > 3 || input.startsWith("0") && input.length() > 1) {
                throw new Exception();
            }
            inputPrice = Integer.parseInt(input);
            String convertedInput;

            switch (inputLength) {
                case 3:
                    if (inputPrice % 100 / 10 == 0) {
                        convertedInput = (wordsMap.get((inputPrice / 100) * 100)) + " " + wordsMap.get(inputPrice % 100 % 10);
                    } else if (inputPrice % 100 % 10 == 0) {
                        convertedInput = (wordsMap.get((inputPrice / 100) * 100)) + " " + wordsMap.get((inputPrice % 100 / 10) * 10);
                    } else if (((inputPrice % 100) / 10) == 1) {
                        convertedInput = (wordsMap.get((inputPrice / 100) * 100)) + " " + wordsMap.get((inputPrice % 100));
                    } else {
                        convertedInput = (wordsMap.get((inputPrice / 100) * 100)) + " " + wordsMap.get((inputPrice % 100 / 10) * 10) + " " + wordsMap.get(inputPrice % 100 % 10);
                    }
                    break;
                case 2:
                    if (inputPrice / 10 == 1) {
                        convertedInput = wordsMap.get(inputPrice);
                    } else {
                        if (inputPrice % 10 == 0) {
                            convertedInput = wordsMap.get(inputPrice);
                        } else
                            convertedInput = wordsMap.get((inputPrice % 100 / 10) * 10) + " " + wordsMap.get(inputPrice % 100 % 10);
                    }
                    break;
                default:
                    convertedInput = (wordsMap.get(inputPrice));
                    break;
            }

            return convertedInput;

        } catch (Exception e) {
            System.out.println("Введи 3х значное число");
        }
        return null;
    }

}
