package f_mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

public class BooksProcessorTest {

    @Test
    public void getTotalPrice_whenNoBooksInDatabase_shouldReturn0() {
        Database mockedDatabase = Mockito.mock(Database.class);
        BooksProcessor booksProcessor = new BooksProcessor(mockedDatabase);
        double totalPrice = booksProcessor.getTotalPrice();
        assertThat(totalPrice).isEqualTo(0);
    }

    @Test
    public void getTotalPrice_whenOneBooksInDatabase_shouldReturnItsPrice() {
        Database mockedDatabase = Mockito.mock(Database.class);
        Book book = new Book("To", 100);
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(book);
        Mockito.when(mockedDatabase.getBooks())
                .thenReturn(listOfBooks);
        BooksProcessor booksProcessor = new BooksProcessor(mockedDatabase);
        double totalPrice = booksProcessor.getTotalPrice();
        assertThat(totalPrice).
                isEqualTo(100);
    }

    @Test
    public void getTotalPrice_whenTwoBooksInDatabase_shouldReturnItsPrice() {
        Database mockedDatabase = Mockito.mock(Database.class);
        Book book1 = new Book("To", 100);
        Book book2 = new Book("To", 200);

        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        Mockito.when(mockedDatabase.getBooks())
                .thenReturn(listOfBooks);
        BooksProcessor booksProcessor = new BooksProcessor(mockedDatabase);
        double totalPrice = booksProcessor.getTotalPrice();
        assertThat(totalPrice).
                isEqualTo(300);
    }

    @Test
    public void getTotalPrice_WhenGettingTotalPrice_shouldCall_getBooksMethod() {
        Database mockedDatabase = Mockito.mock(Database.class);
        BooksProcessor booksProcessor = new BooksProcessor(mockedDatabase);
        booksProcessor.getTotalPrice();
        verify(mockedDatabase).getBooks();
    }
}
