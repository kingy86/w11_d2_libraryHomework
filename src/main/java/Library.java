import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> collectionOfBooks;

    public Library(int capacity){
        this.collectionOfBooks = new ArrayList<Book>();
        this.capacity = 3;
    }

    public int bookCount(){
        return collectionOfBooks.size();
    }

    public boolean addBook(Book book){
        if (this.checkCapacity()){
            return false;
        }
        collectionOfBooks.add(book);
        return true;
    }

    public boolean checkCapacity(){
        if(this.bookCount() >= this.capacity)
            return true;
        return false;

    }
}
