import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;

public class BookServiceTest {
    @Mock
    private BookRepository bookRepository;

    private BookService bookService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testFindBookById() {
        String bookId = "123";
        Book expectedBook = new Book(bookId, "Test Book");
        Mockito.when(bookRepository.findById(bookId)).thenReturn(expectedBook);

        Book result = bookService.findBookById(bookId);
        Mockito.verify(bookRepository).findById(bookId);
        Assert.assertEquals(expectedBook, result);
    }

    @Test
    public void testFindAllBooks() {
        List<Book> expectedBooks = Arrays.asList(new Book("1", "Book 1"), new Book("2", "Book 2"));
        Mockito.when(bookRepository.findAll()).thenReturn(expectedBooks);

        List<Book> result = bookService.findAllBooks();
        Mockito.verify(bookRepository).findAll();
        Assert.assertEquals(expectedBooks, result);
    }
}
