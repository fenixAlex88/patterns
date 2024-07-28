package composite;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Сказки", "Народные", "745645540-2352");
        Book book2 = new Book("Book2");
        Book book3 = new Book("Book3", "Pushkin");
        Book book4 = new Book("Book4", "Народные");

        BookFolder bookFolder = new BookFolder("Главная папка");
        bookFolder.add(book1);
        bookFolder.add(book3);
        BookFolder subBookFolder = new BookFolder("Фантастика");
        subBookFolder.add(book2);
        subBookFolder.add(book4);
        bookFolder.add(subBookFolder);

        bookFolder.about();
    }
}
