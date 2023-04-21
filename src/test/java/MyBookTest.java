import com.challenges.objectorientation.MyBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

public class MyBookTest {

    @InjectMocks
    MyBook myBook;

    @BeforeEach
    public void setup(){
        myBook = new MyBook("The little prince", "Antoine de Saint-Exupéry", 88);
    }

    @Test
    public void executeTest(){
       String result = myBook.display();
        Assertions.assertEquals("Details: {Price: 88, Title: 'The little prince', Author: 'Antoine de Saint-Exupéry'}", result);
    }
}
