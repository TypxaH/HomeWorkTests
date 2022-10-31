import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMainLogic {
    @Test
    public void testSumOfNNumbersIsCorrectWithFiveNumbers() {
        //sum = 1 + 2 + 3 + 4 + 5 = 15
        String numbers = "1\n2\n3\n4\n5";
        int numsCount = 5;
        InputStream in = new ByteArrayInputStream(numbers.getBytes());
        System.setIn(in);
        int actualSumInt = Main.sumOf_N_Numbers(numsCount);
        System.setIn(System.in);
        int expectedSum = 15;
        assertEquals(expectedSum,actualSumInt);
    }
    @Test
    public void testSumOfNNumbersIsCorrectWithNoNumbers() {
        //sum = 0
        String numbers = "";
        int numsCount = 0;
        InputStream in = new ByteArrayInputStream(numbers.getBytes());
        System.setIn(in);
        int actualSumInt = Main.sumOf_N_Numbers(numsCount);
        System.setIn(System.in);
        int expectedSum = 0;
        assertEquals(expectedSum,actualSumInt);
    }
    @Test
    public void testSumOfNNumbersIsCorrectWithNegativeNumbers() {
        //sum = -1 + (-2) + 3 + 4 = 4
        String numbers = "-1\n-2\n3\n4";
        int numsCount = 4;
        InputStream in = new ByteArrayInputStream(numbers.getBytes());
        System.setIn(in);
        int actualSumInt = Main.sumOf_N_Numbers(numsCount);
        System.setIn(System.in);
        int expectedSum = 4;
        assertEquals(expectedSum,actualSumInt);
    }
}
//Поотделно тестовете вървят, но като ги пусна заедно, единят не тръгва.