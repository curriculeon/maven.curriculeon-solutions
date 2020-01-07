package com.github.curriculeon;

import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 10/01/2019.
 */
public class StringParser {

    public static Character[] parseCharacters(String input) {
        if(input == null) {
            return null;
        }
        Character[] result = new Character[input.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = input.charAt(i);
        }
        return result;
    }

    public static Integer[] parseIntegers(String input) {
        if(input == null) {
            return null;
        }
        input = input.replaceAll(" ", "");
        Integer[] result = new Integer[input.length()];
        for (int i = 0; i < result.length; i++) {
            Character currentCharacter = input.charAt(i);
            Integer currentInteger = Integer.valueOf(currentCharacter.toString());
            result[i] = currentInteger;
        }
        return result;
    }

    public static String[] parseStrings(String input) {
        if(input == null) {
            return null;
        }
        return input.split("");
    }

    public static List<String> toList(String[] input) {
        return Arrays.asList(input);
    }
}
