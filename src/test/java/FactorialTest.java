import com.challenges.recursion.Factorial;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FactorialTest {

    @InjectMocks
    Factorial factorial;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void factorialFive(){
        int result = factorial.solveQuestion(5);
        Assertions.assertEquals(120 , result);
    }

    @Test
    public void factorialZero(){
        int result = factorial.solveQuestion(0);
        Assertions.assertEquals(1 , result);
    }
}
