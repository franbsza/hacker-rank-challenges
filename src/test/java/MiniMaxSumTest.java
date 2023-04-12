import com.challenges.basic.MiniMaxSum;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class MiniMaxSumTest {

    @InjectMocks
    MiniMaxSum miniMaxSum;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Rule
    public SystemOutResource sysOut = new SystemOutResource();

    @Test
    public void solveQuestionOne(){
        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);

        miniMaxSum.solveQuestion(arr);

        assertThat(sysOut.asString(),
                containsString("2063136757  2744467344"));
    }
}
