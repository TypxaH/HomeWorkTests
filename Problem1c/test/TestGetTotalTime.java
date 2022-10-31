import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGetTotalTime {
    @Test
    public void testGetTotalTimeWhenMinutesIsLessThen60() {
        String actualSumInt = Main.getTotalTime(10,19);
        String expectedSum = "0:29";
        assertEquals(expectedSum,actualSumInt);
    }
    @Test
    public void testGetTotalTimeWhenMinutesIsMoreThen60() {
        String actualSumInt = Main.getTotalTime(49,100);
        String expectedSum = "2:29";
        assertEquals(expectedSum,actualSumInt);
    }
    @Test
    public void testGetTotalTimeWhenMinutesAndSecondsAreZeros() {
        String actualSumInt = Main.getTotalTime(0,0);
        String expectedSum = "0:0";
        assertEquals(expectedSum,actualSumInt);
    }
}
