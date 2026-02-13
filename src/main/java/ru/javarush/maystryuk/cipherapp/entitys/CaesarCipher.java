package ru.javarush.maystryuk.cipherapp.entitys;

import ru.javarush.maystryuk.cipherapp.services.*;

public class CaesarCipher {
    //Шифрую или дешифрую файл
    public void cipher(String inputFile, String outputFile, int key, boolean encrypt){
        FileManager.processFile(inputFile, outputFile, key, encrypt);
    }
}
