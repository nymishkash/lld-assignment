import java.util.*;

public class Driver {
    public static void main(String[] args) {
        String csvPath = "data/bestsellers_with_categories.csv";
        List<Book> books = DatasetReader.readBooksFromCSV(csvPath);
        System.out.println("Loaded " + books.size() + " books.");
        System.out.println();

        BookService bookService = new BookService(books);

        // Task 2: List all authors in the dataset
        System.out.println("TASK 2: ALL AUTHORS IN THE DATASET");
        for (String author : bookService.getAllAuthors()) {
            System.out.println(author);
        }
        System.out.println();

        // Task 1: Count books by author
        String sampleAuthor = "Stephen King";
        System.out.println("TASK 1: TOTAL NUMBER OF BOOKS BY AUTHOR");
        System.out.println(sampleAuthor + " has " + bookService.countBooksByAuthor(sampleAuthor) + " books.");
        System.out.println();

        // Task 3: List books by author
        System.out.println("TASK 3: NAMES OF ALL BOOKS BY AUTHOR");
        System.out.println("Books by " + sampleAuthor + ":");
        for (String title : bookService.getBooksByAuthor(sampleAuthor)) {
            System.out.println("  • " + title);
        }
        System.out.println();

        // Task 4: Filter books by rating
        double sampleRating = 4.7;
        System.out.println("TASK 4: BOOKS CLASSIFIED BY USER RATING");
        System.out.println("Books with user rating " + sampleRating + ":");
        for (Book b : bookService.getBooksByRating(sampleRating)) {
            System.out.println("  • " + b.getTitle() + " (" + b.getAuthor() + ")");
        }
        System.out.println();

        // Task 5: Get books and prices by author
        System.out.println("TASK 5: PRICES OF ALL BOOKS BY AUTHOR");
        System.out.println("Books and prices by " + sampleAuthor + ":");
        Map<String, Double> bookPriceMap = bookService.getBooksAndPricesByAuthor(sampleAuthor);
        for (Map.Entry<String, Double> entry : bookPriceMap.entrySet()) {
            System.out.println("  • " + entry.getKey() + " - $" + entry.getValue());
        }
        System.out.println();

        // Optionally, print all book details
        // for (Book b : bookService.getBooks()) {
        //     b.printDetails();
        // }
    }
}
