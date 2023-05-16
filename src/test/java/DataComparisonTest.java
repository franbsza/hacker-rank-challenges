import com.challenges.regex.DataComparison;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DataComparisonTest {

    @InjectMocks
    DataComparison dataComparison = new DataComparison();

    private HashMap<String, String> data;

    @BeforeEach
    void setup(){
        data = new HashMap<>();
        data.put("yyyy@gmail.com", "Carl");
        data.put("zzzz@gmail.com", "Beth");
        data.put("vvvv@gmail.com", "Anne");
    }

    @Test
    public void executeTest(){
        List<String> names = dataComparison.execute(data);
        Assertions.assertEquals(Arrays.asList("Anne", "Beth", "Carl"), names);
    }
}
