package polymorphism.exercises.word.servicies.impl;

import polymorphism.exercises.word.servicies.CommandService;

public class CommandServiceImpl implements CommandService {

    @Override
    public String[] cut(String text, Integer startIndex, Integer endIndex) {
        String[] product = new String[2];
        product[0] = text.substring(startIndex, endIndex);
        product[1] = text.replaceAll(product[0], "");
        return product;

    }

    @Override
    public String paste(String text, String fragment, Integer startIndex, Integer endIndex) {
        String targetSubstring = text.substring(startIndex,endIndex);
        return text.replaceAll(targetSubstring,fragment);
    }

    @Override
    public String toUpperCase(String text, Integer startIndex, Integer endIndex) {
        String targetText = text.substring(startIndex,endIndex);
        return text.replaceAll(targetText,targetText.toUpperCase());

    }
}
