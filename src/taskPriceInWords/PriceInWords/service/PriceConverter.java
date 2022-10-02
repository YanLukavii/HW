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
            String result;

            switch (inputLength) {
                case 3:
                    if (inputPrice % 100 / 10 == 0) {// если ноль в середине трехначки
                        result = (wordsMap.get((inputPrice / 100) * 100)) + " " + wordsMap.get(inputPrice % 100 % 10);
                    } else if (inputPrice % 100 % 10 == 0) { // если ноль в конце
                        result = (wordsMap.get((inputPrice / 100) * 100)) + " " + wordsMap.get((inputPrice % 100 / 10) * 10);
                    } else if (((inputPrice % 100) / 10) == 1) { // если в десятках от 11-19
                        result = (wordsMap.get((inputPrice / 100) * 100)) + " " + wordsMap.get((inputPrice % 100));
                    } else {
                        result = (wordsMap.get((inputPrice / 100) * 100)) + " " + wordsMap.get((inputPrice % 100 / 10) * 10) + " " + wordsMap.get(inputPrice % 100 % 10);
                    }  //трехзначка
                    break;
                case 2:
                    if (inputPrice / 10 == 1) {//двухзначка если  10-19
                        result = wordsMap.get(inputPrice);
                    } else {
                        if (inputPrice % 10 == 0) {//двухзначка если десятки 20 30 40 50
                            result = wordsMap.get(inputPrice);
                        } else
                            result = wordsMap.get((inputPrice % 100 / 10) * 10) + " " + wordsMap.get(inputPrice % 100 % 10);
                    } //двузначка обычка
                    break;
                default:
                    result = (wordsMap.get(inputPrice)); // еденички 1-9
                    break;
            }

            return result;

        } catch (Exception e) {
            System.out.println("Введи 3х значное число");
        }
        return null;
    }

}
