import com.challenges.basic.ReversedArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

public class ReversedArrayTest {

    @InjectMocks
    ReversedArray reversedArray;

    @Mock
    List<Integer> arr;

    @BeforeEach
    public void setup(){
        reversedArray = new ReversedArray();
    }

    @Test
    public void solveQuestion(){
        List<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(6);
        arr.add(5);
        arr.add(1);

        String res = reversedArray.solveQuestion(arr);

        Assertions.assertEquals("1 5 6 11" , res);
    }
}
