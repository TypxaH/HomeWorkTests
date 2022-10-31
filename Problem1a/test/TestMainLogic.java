import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMainLogic {
    @Test
    public void testGetTypeOfBanana() {
        String expectedType = "fruit";
        String actualType = Main.getTypeOfProduct("banana");
        assertEquals(expectedType,actualType);
    }
    @Test
    public void testGetTypeOfTomato() {
        String expectedType = "vegetable";
        String actualType = Main.getTypeOfProduct("tomato");
        assertEquals(expectedType,actualType);
    }
    @Test
    public void testGetTypeOfUnknown() {
        String expectedType = "unknown";
        String actualType = Main.getTypeOfProduct("kyufte");
        assertEquals(expectedType,actualType);
    }
}
