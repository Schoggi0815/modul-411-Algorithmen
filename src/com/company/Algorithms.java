package com.company;

public class Algorithms {
    public static String textReverse(String textToReverse){
        int reverseLength = textToReverse.length() / 2;

        StringBuilder newText = new StringBuilder(textToReverse);

        for (int i = 0; i < reverseLength; i++){
            newText.setCharAt(i, textToReverse.charAt(textToReverse.length() - 1 - i));
            newText.setCharAt(textToReverse.length() - 1 - i, textToReverse.charAt(i));
        }

        return newText.toString();
    }

    public static String textToUpper(String textToChange){
        StringBuilder stringBuilder = new StringBuilder(textToChange);

        for (int i = 0; i < textToChange.length(); i++){
            if (stringBuilder.charAt(i) >= 97 && stringBuilder.charAt(i) <= 122){
                stringBuilder.setCharAt(i, (char) (stringBuilder.charAt(i) - 32));
            }
        }

        return stringBuilder.toString();
    }
}
