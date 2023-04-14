import com.challenges.basic.BinaryNumbers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class BinaryNumbersTest {

    @InjectMocks
    BinaryNumbers binaryNumbers;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void executeToBinaryArray(){
        List<Integer> arr = new ArrayList<>();
                    arr.add(1);
                    arr.add(0);
                    arr.add(1);
                    arr.add(1);
                    arr.add(1);
                    arr.add(1);
                    arr.add(1);

        List<Integer> result = binaryNumbers.toBinaryArray(125, 0);
        Assert.assertEquals(arr, result);
    }

    @Test
    public void executeBinaryToString(){
        List<Integer> arr = new ArrayList<>();
                arr.add(1);
                arr.add(0);
                arr.add(1);
                arr.add(1);
                arr.add(1);
                arr.add(1);
                arr.add(1);
        String binaryString = binaryNumbers.binaryToString(arr);
        Assert.assertEquals("1011111" , binaryString);
    }

    @Test
    public void nativeToBinaryTestOne(){
        int result = binaryNumbers.countSequentialOnes(65535); //1111111111111111
        Assert.assertEquals(16 , result);
    }

    @Test
    public void nativeToBinaryTestTwo(){
        int result = binaryNumbers.countSequentialOnes(439); //110110111
        Assert.assertEquals(3 , result);
    }

}
