package ru.javarush.maystryuk.cipherapp;

import ru.javarush.maystryuk.cipherapp.entitys.CaesarCipher;

public class Main {
    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.cipher("in.txt", "out.txt", 3, true);
    }
}
