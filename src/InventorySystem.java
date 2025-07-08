import java.util.ArrayList;
import java.util.List;

public class InventorySystem {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added " + book.title);
    }

    public void removeOutdatedBooks(int maxBookAge, int currentYear) {
        for (int i = 0; i < books.size(); ) {
            Book book = books.get(i);
            if (currentYear - book.getYearPublish() > maxBookAge) {
                System.out.println("Removed outdated book " + book.title);
                books.remove(i);
            } else {
                i++;
            }
        }
    }

    public Book getBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    public void buyBook(String ISBN, int quantity, String email, String address) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                try {
                    book.Buy(quantity, email, address);
                } catch (IllegalArgumentException e) {
                    System.out.println("" + e.getMessage());
                    System.out.println("--------------------------------------");
                }
            }
        }

    }
}
