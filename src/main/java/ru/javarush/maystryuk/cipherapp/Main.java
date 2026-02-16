package ru.javarush.maystryuk.cipherapp;

import ru.javarush.maystryuk.cipherapp.exception.CaesarCipherException;
import ru.javarush.maystryuk.cipherapp.view.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        try {
            menu.start();
        } catch (CaesarCipherException e) {
            System.err.println("Произошла ошибка приложения: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Неожиданная ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}