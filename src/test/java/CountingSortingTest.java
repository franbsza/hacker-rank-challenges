import com.challenges.basic.CountingSorting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSortingTest {

    @InjectMocks
    CountingSorting countingSorting;

    @Mock
    List<Integer> arr;

    @BeforeEach
    public void setup(){
        countingSorting = new CountingSorting();
        arr = new ArrayList<>();
        arr.add(8);
        arr.add(4);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(0);
        arr.add(2);
        arr.add(1);
        arr.add(0);
        arr.add(3);
    }

    @Test
    public void executeTest(){
        List<Integer> result = countingSorting.solveQuestion(arr);
        Assertions.assertEquals(Arrays.asList(2, 1, 2, 2, 2, 0, 0, 0, 1, 0), result);
    }

}
