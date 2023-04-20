import com.challenges.basic.TimeConversion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;

public class TimeConversionTest {

    @InjectMocks
    TimeConversion timeConversion;

    @BeforeEach
    public void setup(){
        timeConversion = new TimeConversion();
    }

    @ParameterizedTest
    @CsvSource({"07:05:45PM,19:05:45", "12:01:00PM,12:01:00", "12:01:00AM,00:01:00", "01:00:00PM, 13:00:00"})
    @DisplayName("convert hour AM/PM format to military (24-hour) time")
    public void solveQuestion(String input, String expected){
        String result = timeConversion.solveQuestion(input);
        Assertions.assertEquals(expected, result);
    }
}
