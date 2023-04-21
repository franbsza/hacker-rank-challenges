import com.challenges.objectorientation.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class StudentTest {

    @InjectMocks
    Student student;

    @BeforeEach
    public void setup(){
        student = new Student();
    }

    private static Stream<Arguments> testScores() {
        return Stream.of(
                arguments(Arrays.asList(12, 60, 34, 56), 40),
                arguments(Arrays.asList(90, 100, 90, 100), 95),
                arguments(Arrays.asList(5, 10, 20, 10), 11),
                arguments(Arrays.asList(60, 70, 65, 71), 66)
        );
    }

    private static Stream<Arguments> finalGrade() {
        return Stream.of(
                arguments(40, 'D'),
                arguments(95, 'O'),
                arguments(11, 'T'),
                arguments(66, 'P')
        );
    }

    @ParameterizedTest
    @MethodSource("testScores")
    public void calculateGrade(List<Integer> testScores, int expected){

        int finalGrade = student.calculateGrade(testScores);
        Assertions.assertEquals(expected, finalGrade);
    }

    @ParameterizedTest
    @MethodSource("finalGrade")
    public void convertGrade(int finalGrade, int expected){

        char grade = student.convertGrade(finalGrade);
        Assertions.assertEquals(expected, grade);
    }
}
