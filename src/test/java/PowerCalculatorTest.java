import com.challenges.basic.PowerCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;

public class PowerCalculatorTest {

    @InjectMocks
    PowerCalculator powerCalculator;

    @BeforeEach
    public void setup(){
        powerCalculator = new PowerCalculator();
    }

    @ParameterizedTest
    @CsvSource({"2,5,32", "2,2,4", "5,2,25"})
    @DisplayName("test if power calculator do all calcs correctly")
    public void executeTest(int n, int p, int expected) throws Exception {
       int result = powerCalculator.power(n,p);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"-2,5", "2,-2", "-5,-2"})
    @DisplayName("test if power calculator throw an Exception")
    public void executeTestError(int n, int p) {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> powerCalculator.power(n,p));
        Assertions.assertEquals("n and p should be non-negative", exception.getMessage());
    }
}
