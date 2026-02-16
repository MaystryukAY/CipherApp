package ru.javarush.maystryuk.cipherapp.services;

import ru.javarush.maystryuk.cipherapp.exception.CaesarCipherException;

import static ru.javarush.maystryuk.cipherapp.statics.Alphabet.ALPHABET;

public class TextManager {
    public static String processText(String textInput, int key, boolean encrypt){
        if ((textInput == null)){
            throw new CaesarCipherException("input text is null!");
        }

        StringBuilder stringBuilder = new StringBuilder();
        CharManager charManager = new CharManager();

        //Нормализую ключ
        key = key % ALPHABET.length;
        if (key < 0) key += ALPHABET.length;

        for (int i = 0; i < textInput.length(); i++) {
            char c = textInput.charAt(i);
            char processChar = charManager.processChar(c, key, encrypt);
            stringBuilder.append(processChar);
        }

        return stringBuilder.toString();
    }
}
