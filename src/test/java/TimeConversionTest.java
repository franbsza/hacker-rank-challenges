import com.challenges.basic.TimeConversion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;

public class TimeConversionTest {

    @InjectMocks
    TimeConversion timeConversion;

    @BeforeEach
    public void setup(){
        timeConversion = new TimeConversion();
    }

    @Test
    @ExtendWith({SystemOutResource.class})
    public void solveQuestionOne(){
        String s = "07:05:45PM";
        String result = timeConversion.solveQuestion(s);
        Assertions.assertEquals(result, "19:05:45");
    }

    @Test
    public void solveQuestionTwo(){
        String s = "12:01:00PM";
        String result = timeConversion.solveQuestion(s);
        Assertions.assertEquals(result, "12:01:00");
    }

    @Test
    public void solveQuestionThree(){
        String s = "12:01:00AM";
        String result = timeConversion.solveQuestion(s);
        Assertions.assertEquals(result, "00:01:00");
    }
}
