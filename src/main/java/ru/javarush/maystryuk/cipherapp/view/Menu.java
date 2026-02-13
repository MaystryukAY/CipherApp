package ru.javarush.maystryuk.cipherapp.view;

import ru.javarush.maystryuk.cipherapp.entitys.CaesarCipher;

import java.util.Scanner;

public class Menu {
    public void start(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n" + "=".repeat(60));
            System.out.println("🔐 ШИФР ЦЕЗАРЯ");
            System.out.println("=".repeat(60));
            System.out.println("1. Шифровать файл (text.txt → crypted.txt)");
            System.out.println("2. Расшифровать файл (crypted.txt → decrypted.txt)");
            System.out.println("3. Brute force (перебор всех ключей)");
            System.out.println("4. Выйти");
            System.out.println("=".repeat(60));
            System.out.print("Выберите действие (1-4): ");

            int choice;
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Введите ключ шифрования (число): ");
                    int encryptKey = Integer.parseInt(scanner.nextLine());
                    CaesarCipher.cipher("text.txt", "crypted.txt", encryptKey, true);
                    break;

                case 2:
                    System.out.print("Введите ключ расшифровки: ");
                    int decryptKey = Integer.parseInt(scanner.nextLine());
                    CaesarCipher.cipher("crypted.txt", "decrypted.txt", decryptKey, false);
                    break;

                case 3:
                    CaesarCipher.bruteForce("crypted.txt");
                    break;

                case 4:
                    System.out.println("👋 До свидания!");
                    scanner.close();
                    return;

                default:
                    System.out.println("❌ Неверный выбор!");
            }
        }
    }
}
