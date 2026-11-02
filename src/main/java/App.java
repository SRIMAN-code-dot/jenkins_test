
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAddition() {
        assertEquals(30, App.add(10, 20));
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        assertEquals(0, App.add(-10, 10));
    }
}
