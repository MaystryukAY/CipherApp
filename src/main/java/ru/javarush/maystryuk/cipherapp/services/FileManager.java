package ru.javarush.maystryuk.cipherapp.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {

    //Считываю файл, получаю текст.
    public void processFile(String inputFile, String outputFile, int key, boolean encrypt){
        try{
            String content = Files.readString(Paths.get(inputFile));
            String result = TextManager.processText(content, key, encrypt);
            Files.writeString(Paths.get(outputFile), result);

        }catch (RuntimeException | IOException e){
            throw new RuntimeException(e);
        }
    }
}
