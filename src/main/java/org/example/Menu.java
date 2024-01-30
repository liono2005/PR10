package org.example;


import java.util.ArrayList;

public class Menu {
    private static ArrayList<Book> books = new ArrayList<>();

    public static void addBook(Book book) {
        books.add(book);
        System.out.println("Книга добавлена в библиотеку.");
    }

    public static void searchBook(String parameter) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(parameter) ||
                    book.getAuthor().equalsIgnoreCase(parameter) ||
                    book.getCategory().equalsIgnoreCase(parameter) ||
                    book.getOrigin().equalsIgnoreCase(parameter) ||
                    String.valueOf(book.getYear()).equals(parameter)) {
                System.out.println(book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Книга не найдена.");
        }
    }

    public static void removeBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println("Книга удалена из библиотеки.");
                return;
            }
        }

        System.out.println("Книга не найдена в библиотеке.");
    }
}