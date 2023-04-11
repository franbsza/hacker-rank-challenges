import com.challenges.basic.PlusMinus;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

@RunWith(MockitoJUnitRunner.class)
public class PlusMinusTest {

    @InjectMocks
    PlusMinus plusMinus;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Rule
    public SystemOutResource sysOut = new SystemOutResource();

    @Test
    public void solveQuestionOne(){
        List<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);

        plusMinus.solveQuestion(arr);
        assertThat(sysOut.asString(),
                containsString(
                "0.500000\n" +
                        "0.333333\n" +
                        "0.166667"));

    }

    @Test
    public void solveQuestionTwo(){
        List<Integer> arr = new ArrayList<>();
        arr.add(-10);
        arr.add(-33);
        arr.add(999);
        arr.add(-5);
        arr.add(-4);
        arr.add(0);

        plusMinus.solveQuestion(arr);
        assertThat(sysOut.asString(),
                containsString(
                        "0.166667\n" +
                                "0.666667\n" +
                                "0.166667"));

    }
}
