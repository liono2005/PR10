package org.example;


public class Book {
    private String author;
    private String title;
    private String publisher;
    private int year;
    private String category;
    private String origin;

    public Book(String author, String title, String publisher, int year, String category, String origin) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.category = category;
        this.origin = origin;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public String toString() {
        return "Книга: " + title + "\nАвтор: " + author + "\nИздательство: " + publisher + "\nГод выпуска: " + year + "\nРаздел: " + category + "\nПроисхождение: " + origin + "\n";
    }
}

