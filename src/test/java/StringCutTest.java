import com.challenges.strings.StringCut;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;

public class StringCutTest {

    @InjectMocks
    StringCut stringCut;

    @BeforeEach
    public void setup(){
        stringCut = new StringCut();
    }

    @ParameterizedTest
    @CsvSource({"Hacker Rank,Hce ak akrRn", "Franciele,Facee rnil", "Development,Dvlpet eeomn", "Hello World,HloWrd el ol"})
    public void executeTest(String input, String expected){

      String result = stringCut.solveQuestion(input);
        Assertions.assertEquals(expected, result);
    }
}
