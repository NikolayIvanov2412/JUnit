package ru.netology;

public class Book {
    public String title;
    public int releaseYear;
    public Author author;
    public int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return title.contains(word) || author.getName().contains(word) || author.getSurname().contains(word);
    }

    public int estimatePrice() {
        double price = pages * 3 * Math.sqrt(author.getRating());
        return Math.max((int) Math.floor(price), 250);
    }
}
