import com.challenges.basic.TimeConversion;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

@RunWith(MockitoJUnitRunner.class)
public class TimeConversionTest {

    @InjectMocks
    TimeConversion timeConversion;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Rule
    public SystemOutResource sysOut = new SystemOutResource();

    @Test
    public void solveQuestionOne(){
        String s = "07:05:45PM";

        timeConversion.solveQuestion(s);

        assertThat(sysOut.asString(), containsString("19:05:45"));
    }

    @Test
    public void solveQuestionTwo(){
        String s = "12:01:00PM";

        timeConversion.solveQuestion(s);


        assertThat(sysOut.asString(), containsString("12:01:00"));
    }

    @Test
    public void solveQuestionThree(){
        String s = "12:01:00AM";

        timeConversion.solveQuestion(s);


        assertThat(sysOut.asString(), containsString("00:01:00"));
    }
}
