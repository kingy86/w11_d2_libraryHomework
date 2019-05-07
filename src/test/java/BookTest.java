import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("George RR Martin", "A Feast For Crows", "Fantasy");
    }

    @Test
    public void bookHasTitle(){
        book.hasTitle();
        assertEquals("A Feast For Crows", book.hasTitle());
    }

    @Test
    public void bookHasAuthor(){
        book.hasAuthor();
        assertEquals("George RR Martin", book.hasAuthor());
    }

    @Test
    public void bookHasGenre(){
        book.hasGenre();
        assertEquals("Fantasy", book.hasGenre());
    }
}
