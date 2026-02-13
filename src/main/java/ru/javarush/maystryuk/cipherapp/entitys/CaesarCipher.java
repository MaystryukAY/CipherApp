package ru.javarush.maystryuk.cipherapp.entitys;

import ru.javarush.maystryuk.cipherapp.services.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static ru.javarush.maystryuk.cipherapp.statics.Alphabet.ALPHABET;

public class CaesarCipher {
    //Шифрую или дешифрую файл
    public static void cipher(String inputFile, String outputFile, int key, boolean encrypt){
        FileManager.processFile(inputFile, outputFile, key, encrypt);
    }

    public static void bruteForce(String inputFile) {
        try {
            String content = Files.readString(Paths.get(inputFile));

            for (int key = 0; key < ALPHABET.length; key++) {
                String decrypted = TextManager.processText(content, key, false);
                System.out.printf("Ключ %2d: %s\n", key, decrypted.substring(0, Math.min(content.length(), decrypted.length())));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
