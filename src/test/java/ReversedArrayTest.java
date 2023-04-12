import com.challenges.basic.ReversedArray;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class ReversedArrayTest {

    @InjectMocks
    ReversedArray reversedArray;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Rule public SystemOutResource sysOut = new SystemOutResource();


    @Test
    public void solveQuestion(){
        List<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(6);
        arr.add(5);
        arr.add(1);

        reversedArray.solveQuestion(arr);

        assertThat(sysOut.asString() , containsString("1 5 6 11"));
    }
}
