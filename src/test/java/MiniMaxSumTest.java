import com.challenges.basic.MiniMaxSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;

public class MiniMaxSumTest {

    @InjectMocks
    MiniMaxSum miniMaxSum;

    @Mock
    ArrayList<Integer> arr;

    @BeforeEach
    public void setup(){
        miniMaxSum = new MiniMaxSum();
        arr = new ArrayList<>(5);
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);
    }

    @Test
    public void solveQuestionOne(){
        String result = miniMaxSum.solveQuestion(arr);
        Assertions.assertEquals("2063136757  2744467344", result);
    }
}
