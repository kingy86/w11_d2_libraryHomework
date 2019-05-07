import java.util.ArrayList;

public class Library {

    private ArrayList<Book>book;
    private int capacity;

    public Library(int capacity){
        this.book = new ArrayList<>();
        this.capacity = 10;
    }
}
