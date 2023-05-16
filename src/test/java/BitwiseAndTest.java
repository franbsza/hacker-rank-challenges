import com.challenges.basic.BitwiseAnd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;

public class BitwiseAndTest {

    @InjectMocks
    BitwiseAnd bitwiseAnd = new BitwiseAnd();

    @ParameterizedTest
    @CsvSource(value = {"5,2,1", "8,5,4", "2,2,0"})
    public void executeTest(int N, int K, int expected){
       int num = bitwiseAnd.execute(N,K);
        Assertions.assertEquals(expected, num);
    }
}
