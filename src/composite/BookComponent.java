package composite;

public class BookComponent {
    int level;

    void showLevel() {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
    }

    void about(int level){
        this.level = level;
        about();
    }

    String getName(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    String getAuthor(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void add(BookComponent component){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void remove(BookComponent component){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    BookComponent getChild(int index){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void about(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
