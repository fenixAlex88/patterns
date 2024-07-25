package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Сказки", "Народные", "745645540-2352");
//        System.out.println(book);
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook("Master");
        bookShelf.addBook("Book2");
        bookShelf.addBook("Book 3");
        bookShelf.addBook("Book 4", "Pushkin");
        bookShelf.addBook("Book 5");

        Iterator<Book> iterator = bookShelf.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
