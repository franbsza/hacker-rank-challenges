import com.challenges.basic.MockDayTwo;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class MockDayTwoTest {

    @InjectMocks
    MockDayTwo mockDayTwo;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void executeTest(){
        List<List<Integer>> matrix = new ArrayList<>();

        List<Integer> matrixAux1 = new ArrayList<>();
        matrixAux1.add(112);
        matrixAux1.add(42);
        matrixAux1.add(83);
        matrixAux1.add(119);

        List<Integer> matrixAux2 = new ArrayList<>();
        matrixAux2.add(56);
        matrixAux2.add(125);
        matrixAux2.add(56);
        matrixAux2.add(49);

        List<Integer> matrixAux3 = new ArrayList<>();
        matrixAux3.add(15);
        matrixAux3.add(78);
        matrixAux3.add(101);
        matrixAux3.add(43);


        List<Integer> matrixAux4 = new ArrayList<>();
        matrixAux4.add(62);
        matrixAux4.add(98);
        matrixAux4.add(114);
        matrixAux4.add(108);

        matrix.add(matrixAux1);
        matrix.add(matrixAux2);
        matrix.add(matrixAux3);
        matrix.add(matrixAux4);

        int sum = mockDayTwo.solveQuestion(matrix);

        Assertions.assertEquals(414 , sum);
    }
}
