package composite;

public class Book extends BookComponent {
    String title;
    String author;
    String isbn;
    int price;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    @Override
    String getAuthor() {
        return author;
    }

    @Override
    String getName() {
        return title;
    }

    @Override
    void about() {
        showLevel();
        System.out.println(toString());
    }
}
