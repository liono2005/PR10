package org.example;

import java.awt.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Menu library = new Menu();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Библиотека ===");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Поиск книги");
            System.out.println("3. Удалить книгу");
            System.out.println("4. Выйти");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите автора: ");
                    String author = scanner.nextLine();

                    System.out.print("Введите название: ");
                    String title = scanner.nextLine();

                    System.out.print("Введите издательство: ");
                    String publisher = scanner.nextLine();

                    System.out.print("Введите год выпуска: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Введите раздел библиотеки: ");
                    String category = scanner.nextLine();

                    System.out.print("Введите происхождение книги: ");
                    String origin = scanner.nextLine();

                    Menu.addBook(new Book(author, title, publisher, year, category, origin));
                    break;

                case 2:
                    System.out.print("Введите параметр для поиска: ");
                    String searchParameter = scanner.nextLine();
                    Menu.searchBook(searchParameter);
                    break;

                case 3:
                    System.out.print("Введите название книги для удаления: ");
                    String bookTitle = scanner.nextLine();
                    Menu.removeBook(bookTitle);
                    break;

                case 4:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }
}