import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {


    Book book;
    Library library;

    @Before
    public void before(){
        book = new Book("Jon Ronson", "Men who stare at goats", "Fiction");
        library = new Library(5);
    }

    @Test
    public void emptyLibrary(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addingBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void libraryAtCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(true, library.checkCapacity());
        assertEquals(3, library.bookCount());
    }

}
