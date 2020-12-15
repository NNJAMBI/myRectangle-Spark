import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class RectangleTest {
    @Test
    public void all_returnsAllInstancesOfRectangle_true() throws Exception {
        Rectangle firstRectangle = new Rectangle(10, 20);
        Rectangle secondRectangle = new Rectangle(5, 5);
        assertTrue(Rectangle.all().contains(firstRectangle));
        assertTrue(Rectangle.all().contains(secondRectangle));
    }

    @Test
    public void area_returnsTheAreaOfTheRectangle_450() {
        Rectangle testRectangle = new Rectangle(15, 30);
        assertEquals(450, testRectangle.area());
    }

}
