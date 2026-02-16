package ru.javarush.maystryuk.cipherapp.services;

import static ru.javarush.maystryuk.cipherapp.statics.Alphabet.ALPHABET;

public class CharManager {
    public char processChar(char c, int key, boolean encrypt) {
        boolean isUpperCase = Character.isUpperCase(c);
        char lowerCase = Character.toLowerCase(c);
        int index = findCharIndex(lowerCase);
        int newIndex;

        if (index < 0) {
            return c;// Символ не из алфавита - оставляем как есть
        }

        if (encrypt) {
            newIndex = (index + key) % ALPHABET.length;
        } else {
            newIndex = (index - key) % ALPHABET.length;
            if (newIndex < 0) {
                newIndex += ALPHABET.length;
            }
        }
        char resultChar = ALPHABET[newIndex];

        if (isUpperCase) {
            resultChar = Character.toUpperCase(resultChar);
        }

        return resultChar;
    }

    private int findCharIndex(char c) {
        for (int i = 0; i < ALPHABET.length; i++) {
            if (ALPHABET[i] == c) {
                return i;
            }
        }
        return -1;
    }
}
