package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(String title) {
        books.add(new Book(title, "unknown", "---------"));
    }

    void addBook(String title, String author) {
        books.add(new Book(title, author, "----------"));
    }

    Iterator<Book> createIterator() {
        return new BookShelfIterator(books);
    }
}
