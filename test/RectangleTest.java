import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class RectangleTest {

    @Test (expected = RuntimeException.class)
    public  void  testNegativeLength() {
        Rectangle rectangle = new Rectangle(-2 ,0);
    }

    @Test
    public void testCalculateAreaZero() {
        Rectangle rectangle = new Rectangle(0 ,0);
        assertEquals(0, rectangle.area(), 0.001);
    }

    @Test
    public void testCalculateAreaOne() {
        Rectangle rectangle = new Rectangle(1 ,1);
        assertEquals(1, rectangle.area(), 0.001);
    }

    @Test
    public void testCalculateCircumferenceZero() {
        Rectangle rectangle = new Rectangle(0 ,0);
        assertEquals(0, rectangle.circumference(),0.001);
    }

    @Test
    public void testCalculateArea() {
        Rectangle rectangle = new Rectangle(5 ,3);
        assertEquals(15, rectangle.area(),0.001);
    }

    @Test
    public void testCalculateCircumference() {
        Rectangle rectangle = new Rectangle(5, 3);
        assertEquals(16, rectangle.circumference(), 0.001);
    }
}
