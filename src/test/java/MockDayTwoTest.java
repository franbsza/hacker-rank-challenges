import com.challenges.basic.MockDayTwo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.util.ArrayList;
import java.util.List;

public class MockDayTwoTest {

    @InjectMocks
    MockDayTwo mockDayTwo;

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
