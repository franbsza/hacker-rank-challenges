import com.challenges.basic.BinaryNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

public class BinaryNumbersTest {

    @InjectMocks
    BinaryNumbers binaryNumbers;

    @Mock
    List<Integer> arr;

    @BeforeEach
    public void setup(){
        binaryNumbers = new BinaryNumbers();
        arr = new ArrayList<>();
            arr.add(1);
            arr.add(1);
            arr.add(0);
            arr.add(0);
            arr.add(1);
    }

    @Test
    @DisplayName("test custom method converting base 10 number to binary")
    public void executeToBinaryArray(){
        List<Integer> result = binaryNumbers.toBinaryArray(25, 0);
        Assertions.assertEquals(arr, result);
    }

    @Test
    @DisplayName("test custom method converting base 10 number to binary string")
    public void executeBinaryToString(){
        String binaryString = binaryNumbers.binaryToString(arr);
        Assertions.assertEquals("11001" , binaryString);
    }

    @ParameterizedTest
    @CsvSource({"125,5", "65535,16", "439,3", "25,2"})
    @DisplayName("count sequence of numbers 1 has after converting base 10 number to binary")
    public void nativeToBinaryTestOne(int input, int expected){
        int result = binaryNumbers.countSequentialOnes(input);
        Assertions.assertEquals(expected , result);
    }
}
