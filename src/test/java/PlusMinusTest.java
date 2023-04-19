import com.challenges.basic.PlusMinus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class PlusMinusTest {

    @InjectMocks
    PlusMinus plusMinus;

    @BeforeEach
    public void setup(){
        plusMinus = new PlusMinus();
    }

    @Test
    public void solveQuestionOne(){
        List<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);

        List<BigDecimal> expectedResult = new ArrayList<>();
        expectedResult.add(BigDecimal.valueOf(0.166667).setScale(6, RoundingMode.HALF_DOWN));
        expectedResult.add(BigDecimal.valueOf(0.333333).setScale(6, RoundingMode.HALF_DOWN));
        expectedResult.add(BigDecimal.valueOf(0.500000).setScale(6, RoundingMode.HALF_DOWN));

        List<BigDecimal> result = plusMinus.solveQuestion(arr);
        Assertions.assertEquals(expectedResult, result);
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

        List<BigDecimal> expectedResult = new ArrayList<>();
        expectedResult.add(BigDecimal.valueOf(0.166667).setScale(6, RoundingMode.HALF_DOWN));
        expectedResult.add(BigDecimal.valueOf(0.666667).setScale(6, RoundingMode.HALF_DOWN));
        expectedResult.add(BigDecimal.valueOf(0.166667).setScale(6, RoundingMode.HALF_DOWN));

        List<BigDecimal> result = plusMinus.solveQuestion(arr);
        Assertions.assertEquals(expectedResult, result);
    }
}
