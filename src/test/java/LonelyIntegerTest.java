import com.challenges.basic.LonelyInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

public class LonelyIntegerTest {

    @InjectMocks
    LonelyInteger lonelyInteger;

    @Mock
    List<Integer> arr;

    @BeforeEach
    public void setup(){

        lonelyInteger = new LonelyInteger();

        arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(4);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(3);
    }

    @Test
    public void executeTest(){
      int number =  lonelyInteger.solveQuestion(arr);
        Assertions.assertEquals(4, number);
    }
}
