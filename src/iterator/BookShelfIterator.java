package iterator;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book> {

    ArrayList<Book> books = new ArrayList<>();
    int position;

    public BookShelfIterator(ArrayList<Book> books) {
        this.books = books;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < books.size() && books.get(position) != null;
    }

    @Override
    public Book next() {
        Book book = books.get(position);
        position++;
        return book;
    }

    @Override
    public void remove() {
        if (position < 0 || position >= books.size()) {
            throw new IndexOutOfBoundsException("Invalid position: " + position);
        }
        books.remove(position);
    }
}
