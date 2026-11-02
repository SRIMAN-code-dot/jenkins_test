import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAddition() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testMain() {
        App app = new App();
        assertNotNull(app);
    }
}
