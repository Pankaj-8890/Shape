import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TriangleTest  {

    @Test (expected = RuntimeException.class)
    public  void  testTriangleExist() {
        Triangle triangle = new Triangle(8.0 ,1.0, 1.0);
    }

    @Test (expected = RuntimeException.class)
    public  void  testNegativeLength() {
        Triangle triangle = new Triangle(-2.0 ,-1.0, -2.0);
    }

    @Test
    public void testAreaWithLengthsZeroShouldBeZero() {
        Triangle triangle = new Triangle(0 ,0, 0);
        assertEquals(0, triangle.area(), 0.001);
    }

    @Test
    public void testCircumferenceWithLengthsZeroShouldBeZero() {
        Triangle triangle = new Triangle(0 ,0, 0);
        assertEquals(0, triangle.circumference(),0.001);
    }

    @Test
    public void testCalculateArea() {
        Triangle triangle = new Triangle(2.0 ,2.0, 3.0);
        assertEquals(1.9843, triangle.area(),0.001);
    }

    @Test
    public void testCalculateCircumference() {
        Triangle triangle = new Triangle(4.0 ,6.0, 2.0);
        assertEquals(12.0, triangle.circumference(),0.001);
    }
}