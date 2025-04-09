package ru.netology;
import ru.netology.Author;
import ru.netology.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название книги: ");
        String title = scanner.nextLine();

        System.out.println("Введите имя автора книги: ");
        String name = scanner.nextLine();

        System.out.println("Введите фамилию автора книги: ");
        String surname = scanner.nextLine();

        System.out.println("Введите слово для поиска: ");
        String word = scanner.nextLine();

        System.out.println("Введите рейтинг автора: ");
        int rating = scanner.nextInt();

        System.out.println("Введите год выпуска: ");
        int releaseYear = scanner.nextInt();

        System.out.println("Введите количество страниц: ");
        int pages = scanner.nextInt();

        Author author = new Author(name, surname, rating);
        Book book = new Book(title, releaseYear, author, pages);

        System.out.println("Является ли книга большой? " + book.isBig());
        System.out.println("Содержится ли в описании книги переданное параметром слово? " + book.matches(word));
        System.out.println("Оценка стоимости книги: " + book.estimatePrice() + " руб.");
    }

}