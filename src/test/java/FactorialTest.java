import com.challenges.recursion.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;

public class FactorialTest {

    @InjectMocks
    Factorial factorial;

    @BeforeEach
    public void setup(){
        factorial = new Factorial();
    }

    @ParameterizedTest
    @CsvSource({"5,120", "0,1", "9,362880", "10,3628800"})
    @DisplayName("calculator of factorial")
    public void factorial(int input, int expected){
        int result = factorial.solveQuestion(input);
        Assertions.assertEquals(expected , result);
    }
}
