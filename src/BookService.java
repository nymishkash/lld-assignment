import java.util.*;

public class BookService {

    private List<Book> books;

    public BookService(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public int countBooksByAuthor(String author) {
        int count = 0;
        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                count++;
            }
        }
        return count;
    }

    public Set<String> getAllAuthors() {
        Set<String> authors = new HashSet<>();
        for (Book b : books) {
            authors.add(b.getAuthor());
        }
        return authors;
    }

    public List<String> getBooksByAuthor(String author) {
        List<String> titles = new ArrayList<>();
        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                titles.add(b.getTitle());
            }
        }
        return titles;
    }

    public List<Book> getBooksByRating(double rating) {
        List<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (b.getUserRating() == rating) {
                result.add(b);
            }
        }
        return result;
    }

    public Map<String, Double> getBooksAndPricesByAuthor(String author) {
        Map<String, Double> bookPrices = new LinkedHashMap<>();
        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                bookPrices.put(b.getTitle(), b.getPrice());
            }
        }
        return bookPrices;
    }
}
