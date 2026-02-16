package ru.javarush.maystryuk.cipherapp.services;

import ru.javarush.maystryuk.cipherapp.exception.CaesarCipherException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {
    public static void processFile(String inputFile, String outputFile, int key, boolean encrypt) {
        if ((inputFile == null)){
            throw new CaesarCipherException("input text is null!");
        }

        try {
            String content = Files.readString(Paths.get(inputFile));
            String result = TextManager.processText(content, key, encrypt);
            Files.writeString(Paths.get(outputFile), result);
        } catch (IOException e) {
            throw new CaesarCipherException("Ошибка при обработке файла: " + inputFile, e);
        }
    }
}
