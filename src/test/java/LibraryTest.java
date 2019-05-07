import org.junit.Before;
import org.junit.Test;

public class LibraryTest {


    Book book;
    Library library;

    @Before
    public void before(){
        book = new Book("George RR Martin", "A Feast For Crows", "Fantasy");
        book = new Book("Sam Bourne", "The Chosen One", "Thriller");
        book = new Book("Jon Ronson", "The Men Who Stare At Goats", "Fiction");
    }

}
