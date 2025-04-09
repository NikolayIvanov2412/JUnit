package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    public void isBig_WhenPagesMoreThan500_ReturnTrue() {
        // Given
        Author author = new Author("John", "Doe", 90);
        Book book = new Book("Big Book", 2010, author, 600);

        // When
        boolean actualResult = book.isBig();

        // Then
        Assertions.assertTrue(actualResult, "The book should be considered big");
    }

    @Test
    public void matches_WhenWordMatchesWithTitle_ReturnTrue() {
        // Given
        Author author = new Author("Jane", "Smith", 80);
        Book book = new Book("Adventures in the Wild", 2015, author, 400);

        // When
        boolean actualResult = book.matches("Wild");

        // Then
        Assertions.assertTrue(actualResult, "The word 'Wild' should match with the title");
    }

    @Test
    public void estimatePrice_WhenBookHasHighRatingAndManyPages_ReturnExpectedValue() {
        // Given
        Author author = new Author("Leo", "Tolstoy", 95);
        Book book = new Book("War and Peace", 1869, author, 1200);

        // When
        double actualPrice = book.estimatePrice();

        // Then
        double expectedPrice = 35088.0;
        Assertions.assertEquals(expectedPrice, actualPrice, "The estimated price should be correct");
    }
}